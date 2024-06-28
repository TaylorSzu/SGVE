package controller;

import dao.ConexaoMySql;
import dao.LoginDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import dao.VendaDAO;
import entidades.Produto;
import entidades.Usuario;
import entidades.Venda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.PesquisaVendaTableModel;
import model.ProdutoTableModel;
import model.RelatorioMesTableModel;
import model.TabelaTop10TableModel;
import model.VendaTableModel;
import view.Dashboard;

public class VendaController implements ActionListener, KeyListener, MouseListener, ChangeListener{
    
    private Dashboard dashboard;
    private ProdutoDAO produtoDAO;
    private VendaDAO vendaDAO;
    private Produto produto;
    private Venda venda;
    private Produto produtoEmEdicao;
    private List<Produto> produtos;
    private List<Venda> vendas;
    private ProdutoTableModel produtoTableModel;
    private PesquisaVendaTableModel pesquisaVendaTableModel;
    private RelatorioMesTableModel relatorioMesTableModel;
    private TabelaTop10TableModel tabelaTop10TableModel;
    private VendaTableModel vendaTableModel;
    private UsuarioDAO usuarioDAO;
    private LoginDAO loginDAO;
    private BigDecimal lucro;

    public VendaController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.produtoDAO = new ProdutoDAO();
        this.vendaDAO = new VendaDAO();
        this.vendas = vendaDAO.HistoricoVenda();
        this.produtos = produtoDAO.listarProduto();
        this.usuarioDAO = new UsuarioDAO();
        this.loginDAO = new LoginDAO();
        this.produtoTableModel = new ProdutoTableModel(new ArrayList<>());
        this.pesquisaVendaTableModel = new PesquisaVendaTableModel(new ArrayList<>());
        this.relatorioMesTableModel = new RelatorioMesTableModel(new ArrayList<>());
        this.vendaTableModel = new VendaTableModel(new ArrayList<>());
        this.tabelaTop10TableModel = new TabelaTop10TableModel(new ArrayList<>());
        this.lucro = calcularLucroTotal();
        this.dashboard.getLabelTotal().setText("R$" + lucro.toString());
        dashboard.getTxtPesquisarProdutoVenda().addKeyListener(this);
        dashboard.getTxtValorPagoVenda().addKeyListener(this);
        dashboard.getTxtPesquisarPorDataMes().addKeyListener(this);
        dashboard.getTabelaRegistrarVenda().addMouseListener(this);
        dashboard.getSpinnerQuantidadeVenda().addChangeListener(this);
        dashboard.getTabelaRegistrarVenda().setModel(pesquisaVendaTableModel);
        dashboard.getTabelaRealorioMes().setModel(relatorioMesTableModel);
        dashboard.getTabelaHistoricoVendas().setModel(vendaTableModel);
        dashboard.getTabelaTop10().setModel(tabelaTop10TableModel);
        preencherTabela();
        preencherTop10();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase().trim();
        
        switch (acao) {
            case "vender" : Vender(); break;
            case "cancelar" : Cancelar(); break;
            case "excluir" : Excluir(); break;
        }
    }
    
    private void Vender(){
        registrarVenda();
        limparCampos();
    }
    
    private void Cancelar(){
        limparCampos();
        painelComponentes(this.dashboard.getPainelEstatisticas());
    }
    
    private void Excluir() {
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            if (venda != null) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta venda?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
                if (confirmar == JOptionPane.YES_OPTION) {
                    vendaDAO.deletarVenda(venda);
                    preencherTabela();
                    atualizarTabelaVenda(vendaDAO.HistoricoVenda());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    private Usuario usuarioLogado(){
        String usuarioLogado = this.dashboard.getLabelUsuarioLogado().getText();
        List<Usuario> usuarios = usuarioDAO.BuscarUsuarioPorUsuario(usuarioLogado);
        return usuarios.get(0);
    }
    
    private void painelComponentes(JPanel panel){
        this.dashboard.getPainelPrincipal().removeAll();
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
        this.dashboard.getPainelPrincipal().add(panel);
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
    }
    
    private void registrarVenda(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        VendaDAO vendaDAO = new VendaDAO();
        
        String produtoNome, pagamento, valorPagoStr;
        int quantidade;
        
        produtoNome = dashboard.getTxtProdutoVenda().getText();
        pagamento = dashboard.getComboBoxPagamento().getSelectedItem().toString();
        quantidade = (int) dashboard.getSpinnerQuantidadeVenda().getValue();
        valorPagoStr = dashboard.getTxtValorPagoVenda().getText();
        BigDecimal valorPago = new BigDecimal(valorPagoStr);
        int estoque = Integer.parseInt(dashboard.getTxtEstoqueAtualVenda().getText());  
        
        if(estoque != 0){
            Venda venda = new Venda(produtoNome, quantidade, valorPago, pagamento);
            vendaDAO.registrarVenda(venda);
            produtoDAO.atualizarEstoqueProduto(produtoNome, quantidade);
            
            atualizarTabelaEstoque(produtoDAO.listarProduto());
            atualizarTabelaProdutos(produtoDAO.listarProduto());
            atualizarTabelaVenda(vendaDAO.HistoricoVenda());
            atualizarTabelaRelatorioMes(vendaDAO.HistoricoVenda());
            preencherTabela();
            lucro = lucro.add(valorPago);
            this.dashboard.getLabelTotal().setText("R$" + lucro.toString());
            JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            limparCampos();
            JOptionPane.showMessageDialog(null, "Quantidade insuficiente em estoque.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherTabela(){
        List<Venda> vendas = vendaDAO.HistoricoVenda();
        VendaTableModel modeloTabela = new VendaTableModel(vendas);
        dashboard.getTabelaHistoricoVendas().setModel(modeloTabela);
        atualizarTabelaVenda(vendaDAO.HistoricoVenda());
    }
    
    private void preencherTop10(){
        List<Venda> vendas = vendaDAO.listarTopProdutosVendidos();
        TabelaTop10TableModel modeloTabela = new TabelaTop10TableModel(vendas);
        dashboard.getTabelaTop10().setModel(modeloTabela);
        atualizarTabelaTop10(vendaDAO.listarTopProdutosVendidos());
    }
    
    private void pesquisar() {
        String pesquisa = dashboard.getTxtPesquisarProdutoVenda().getText().trim();
        List<Produto> produtosEncontrados = produtos.stream()
                .filter(p -> p.getNome().toLowerCase().contains(pesquisa))
                .collect(Collectors.toList());
        System.out.println("Produto Encontrado");
        atualizarTabelaEstoque(produtosEncontrados);
    }
    
    private void pesquisarRelatorioData(){
        String pesquisa = dashboard.getTxtPesquisarPorDataMes().getText().toLowerCase().trim();
        List<Venda> vendasEncontradas = vendas.stream()
                .filter(v -> v.getData().toString().toLowerCase().contains(pesquisa))
                .collect(Collectors.toList());
        System.out.println("Venda Encontrada");
        atualizarTabelaRelatorioMes(vendasEncontradas);
        BigDecimal totalVendas = calcularTotalVendas(vendasEncontradas);
        dashboard.getLabelLucroPesquisado().setText("R$" + totalVendas);
    }
    
    private void atualizarTabelaTop10(List<Venda> vendas){
        tabelaTop10TableModel.setVendas(vendas);
        dashboard.getTabelaTop10().repaint();
        dashboard.getTabelaTop10().revalidate();
    }
    
    private void atualizarTabelaRelatorioMes(List<Venda> vendas){
        relatorioMesTableModel.setVendas(vendas);
        dashboard.getTabelaRealorioMes().repaint();
        dashboard.getTabelaRealorioMes().revalidate();
    }
    
    private void atualizarTabelaVenda(List<Venda> vendas){
        vendaTableModel.setVendas(vendas);
        dashboard.getTabelaHistoricoVendas().repaint();
        dashboard.getTabelaHistoricoVendas().revalidate();
        this.dashboard.getLabelVenda().setText(String.format("%d", vendas.size()));
    }
    
    private void atualizarTabelaEstoque(List<Produto> produtos) {
        pesquisaVendaTableModel.setProdutos(produtos);
        dashboard.getTabelaControleEstoque().repaint();
        dashboard.getTabelaControleEstoque().revalidate();
    }
    
    private void atualizarTabelaProdutos(List<Produto> produtos) {
        produtoTableModel.setProdutos(produtos);
        dashboard.getTabelaListaProduto().repaint();
        dashboard.getTabelaListaProduto().revalidate();
}
    
    private void limparCampos(){
        dashboard.getTxtPesquisarProdutoVenda().setText("");
        dashboard.getTxtProdutoVenda().setText("");
        dashboard.getSpinnerQuantidadeVenda().setValue(0);
        dashboard.getTxtValorPagoVenda().setText("");
        dashboard.getComboBoxPagamento().setSelectedItem("Pix");
        dashboard.getLabelTotalVenda().setText("0.00");
        dashboard.getLabelValorPago().setText("0.00");
        dashboard.getLabelTroco().setText("0.00");
    }
    
    private BigDecimal calcularTotalVendas(List<Venda> vendas) {
        BigDecimal total = BigDecimal.ZERO;
        for (Venda venda : vendas) {
            total = total.add(venda.getValorPago());
        }
        return total;
    }
    
    private void calcularValor(){
        int linhaSelecionada = dashboard.getTabelaRegistrarVenda().getSelectedRow();
        String nomeProduto = dashboard.getTxtProdutoVenda().getText().toLowerCase().trim();
        Produto produtoSelecionado = null;
        
        for(Produto produto : produtos){
            if(produto.getNome().equalsIgnoreCase(nomeProduto)){
                produtoSelecionado = produto;
                break;
            }
        }
        
        if(produtoSelecionado != null){
            BigDecimal precoUnitario = produtoSelecionado.getPrecoVenda();
            int quantidade = (int) dashboard.getSpinnerQuantidadeVenda().getValue();
            BigDecimal valorTotal = precoUnitario.multiply(BigDecimal.valueOf(quantidade));
            dashboard.getLabelTotalVenda().setText(valorTotal.toString());
        }
    }
    
    private void valorPago(){
        String valorPagoTxt = dashboard.getTxtValorPagoVenda().getText().trim();
        if(valorPagoTxt != null && !valorPagoTxt.isEmpty()){
            try {
                BigDecimal valorPago = new BigDecimal(valorPagoTxt);
                String valorTotalTxt = dashboard.getLabelTotalVenda().getText();
                BigDecimal valorTotal = new BigDecimal(valorTotalTxt);
                BigDecimal troco = valorPago.subtract(valorTotal);
                String valorPagoFormt = valorPago.setScale(2, BigDecimal.ROUND_HALF_EVEN).toString();
                dashboard.getLabelValorPago().setText(valorPagoFormt);
                dashboard.getLabelTroco().setText(troco.toString());
                dashboard.getLabelValorPago().setText(valorPagoTxt);
            } catch (NumberFormatException erro) {
                System.err.println("Erro ao converter o valor pago para BigDecimal: " + erro.getMessage());
                erro.printStackTrace();
            }
        }
    }
    
    private BigDecimal calcularLucroTotal() {
        BigDecimal lucroTotal = BigDecimal.ZERO;
        for (Venda venda : vendas) {
            lucroTotal = lucroTotal.add(venda.getValorPago());
        }
        return lucroTotal;
    }
    
    private void selecionarItem() {
        int linhaSelecionada = this.dashboard.getTabelaHistoricoVendas().getSelectedRow();
        if (linhaSelecionada != -1 && linhaSelecionada < vendaTableModel.getRowCount()) {
            this.venda = this.vendaTableModel.getProdutos().get(linhaSelecionada);
        }
    }
    
    private void SetarNomeProduto(){
        int linhaSelecionada = dashboard.getTabelaRegistrarVenda().getSelectedRow();
        if(linhaSelecionada != -1){
            String nomeProduto = (String) dashboard.getTabelaRegistrarVenda().getValueAt(linhaSelecionada, 1);
            Integer estoque = (Integer) dashboard.getTabelaRegistrarVenda().getValueAt(linhaSelecionada, 2);
            dashboard.getTxtProdutoVenda().setText(nomeProduto);
            dashboard.getTxtEstoqueAtualVenda().setText(String.valueOf(estoque));
        }   
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        pesquisarRelatorioData();
        pesquisar();
        valorPago();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        selecionarItem();
        SetarNomeProduto();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void stateChanged(ChangeEvent e) {
        calcularValor();
    }
}
