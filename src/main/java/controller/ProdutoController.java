package controller;

import dao.CategoriaDAO;
import dao.ConexaoMySql;
import dao.LoginDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import entidades.Categoria;
import entidades.Produto;
import entidades.Usuario;
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
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.ProdutoTableModel;
import view.Dashboard;

public class ProdutoController implements ActionListener, KeyListener, MouseListener{
    
    private final Dashboard dashboard;
    private ProdutoDAO produtoDAO;
    private CategoriaDAO categoriaDAO;
    private Produto produto;
    private Produto produtoEmEdicao;
    private List<Produto> produtos;
    private ProdutoTableModel produtoTableModel;
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;
    private LoginDAO loginDAO;

    public ProdutoController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.produtoDAO = new ProdutoDAO();
        this.categoriaDAO = new CategoriaDAO();
        this.produtos = produtoDAO.listarProduto();
        this.produtoTableModel = new ProdutoTableModel(new ArrayList<>());
        this.loginDAO = new LoginDAO();
        this.usuarioDAO = new UsuarioDAO();
        dashboard.getTabelaListaProduto().setModel(produtoTableModel);
        atualizarTabela(produtoDAO.listarProduto());
        preencherTabela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "cadastrar" : Cadastrar(); break;
            case "cancelar" : Cancelar(); break;
            case "detalhes" : Detalhes(); break;
            case "editar" : Editar(); break;
            case "excluir" : Excluir(); break;
            case "salvar" : Salvar(); break;
            case "atualizar" : Atualizar(); break;
        }
    }
    
    private void painelComponentes(JPanel panel){
        this.dashboard.getPainelPrincipal().removeAll();
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
        this.dashboard.getPainelPrincipal().add(panel);
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
    }

    private void Cadastrar() {
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            cadastrarProduto();
            limparCampos();
            preencherTabela();
            atualizarTabela(produtoDAO.listarProduto());
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void Salvar(){
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            editarProduto();
            atualizarTabela(produtoDAO.listarProduto());
            limparCampos();
        }
    }

    private void Cancelar() {
        limparCampos();
        painelComponentes(this.dashboard.getPainelEstatisticas());
    }
    
    private void Detalhes(){
        if(produto != null){
            mostrarTelaDetalhe();
            preencherCamposDetalhes();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para ver os detalhes.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void Editar(){
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            if (produto != null) {
                mostrarTelaEditar();
                preencherCamposEdicao();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto para editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    private void Atualizar(){
        atualizarTabela(produtoDAO.listarProduto());
        preencherTabela();
    }

    private void Excluir() {
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            if (produto != null) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Produto?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
                if (confirmar == JOptionPane.YES_OPTION) {
                    produtoDAO.deletarProduto(produto);
                    preencherTabela();
                    atualizarTabela(produtoDAO.listarProduto());
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
    
    private void mostrarTelaEditar() {
        this.dashboard.getTelaEditarProduto().pack();
        this.dashboard.getTelaEditarProduto().setLocationRelativeTo(dashboard);
        this.dashboard.getTelaEditarProduto().setVisible(true);
    }
    
    private void mostrarTelaDetalhe(){
        this.dashboard.getTelaDetalheProduto().pack();
        this.dashboard.getTelaDetalheProduto().setLocationRelativeTo(dashboard);
        this.dashboard.getTelaDetalheProduto().setVisible(true);
    }
    
    private void cadastrarProduto(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        String codigoStr, nome, fabricante, categoria, unidadeMedida, descricao, pesoStr, estoqueStr;
        BigDecimal preco_compra, preco_venda, peso;
        Long codigo;
        int estoque;
        
        codigoStr = dashboard.getTxtCodigoProduto().getText();
        codigo = Long.parseLong(codigoStr);
        nome = dashboard.getTxtNomeProduto().getText();
        fabricante = dashboard.getTxtFabricanteProduto().getText();
        categoria = dashboard.getComboBoxCategoria().getSelectedItem().toString();
        peso = new BigDecimal(dashboard.getTxtPesoProduto().getText());
        unidadeMedida = dashboard.getTxtUnidadeMedidaProduto().getText();
        preco_compra = new BigDecimal(dashboard.getTxtPrecoCompraProduto().getText());
        preco_venda = new BigDecimal(dashboard.getTxtPrecoVendaProduto().getText());
        estoqueStr = dashboard.getTxtEstoqueProduto().getText();
        estoque = Integer.parseInt(estoqueStr);
        descricao = dashboard.getTxtDescricaoProduto().getText();
        
        Produto produto = new Produto(codigo, nome, fabricante, categoria, peso, unidadeMedida, preco_compra, preco_venda, estoque, descricao);
        
        produtoDAO.cadastrarProduto(produto);
        atualizarTabela(produtoDAO.listarProduto());
    }
    
    private void editarProduto(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        String codigoStr, nome, fabricante, categoria, unidadeMedida, descricao, pesoStr, estoqueStr, idStr;
        BigDecimal preco_compra, preco_venda, peso;
        Long codigo,id;
        int estoque;
        
        idStr = dashboard.getTxtIdProdutoEditar().getText();
        id = Long.parseLong(idStr);
        codigoStr = dashboard.getTxtCodigoProdutoEditar().getText();
        codigo = Long.parseLong(codigoStr);
        nome = dashboard.getTxtNomeProdutoEditar().getText();
        fabricante = dashboard.getTxtFabricanteProdutoEditar().getText();
        categoria = dashboard.getComboBoxCategoriaEditar().getSelectedItem().toString();
        peso = new BigDecimal(dashboard.getTxtPesoProdutoEditar().getText());
        unidadeMedida = dashboard.getTxtUnidadeMedidaProdutoEditar().getText();
        preco_compra = new BigDecimal(dashboard.getTxtPrecoCompraProdutoEditar().getText());
        preco_venda = new BigDecimal(dashboard.getTxtPrecoVendaProdutoEditar().getText());
        descricao = dashboard.getTxtDescricaoProdutoEditar().getText();
        
        Produto produto = new Produto(id, codigo, nome, fabricante, categoria, peso, unidadeMedida, preco_compra, preco_venda, descricao);
        
        produtoDAO.atualizarProduto(produto);
        atualizarTabela(produtoDAO.listarProduto());
    }
    
    private void preencherCamposEdicao() {
        dashboard.getTxtIdProdutoEditar().setText(String.valueOf(produto.getId()));
        dashboard.getTxtCodigoProdutoEditar().setText(String.valueOf(produto.getCodigo()));
        dashboard.getTxtNomeProdutoEditar().setText(produto.getNome());
        dashboard.getTxtFabricanteProdutoEditar().setText(produto.getFabricante());
        dashboard.getComboBoxCategoriaEditar().setSelectedItem(produto.getCategoria());
        dashboard.getTxtPesoProdutoEditar().setText(String.valueOf(produto.getPeso()));
        dashboard.getTxtUnidadeMedidaProdutoEditar().setText(produto.getUnidadeMedida());
        dashboard.getTxtPrecoCompraProdutoEditar().setText(String.valueOf(produto.getPrecoCompra()));
        dashboard.getTxtPrecoVendaProdutoEditar().setText(String.valueOf(produto.getPrecoVenda()));
        dashboard.getTxtDescricaoProdutoEditar().setText(produto.getDescricao());
        carregarCategoriaEditar();
    }
    
    private void preencherCamposDetalhes() {
        dashboard.getTxtCodigoProdutoDetalhe().setText(String.valueOf(produto.getCodigo()));
        dashboard.getTxtNomeProdutoDetalhe().setText(produto.getNome());
        dashboard.getTxtFabricanteProdutoDetalhe().setText(produto.getFabricante());
        dashboard.getTxtCategoriaProdutoDetalhe().setText(produto.getCategoria());
        dashboard.getTxtPesoProdutoDetalhe().setText(String.valueOf(produto.getPeso()));
        dashboard.getTxtUnidadeMedidaProdutoDetalhe().setText(produto.getUnidadeMedida());
        dashboard.getTxtPrecoCompraProdutoDetalhe().setText(String.valueOf(produto.getPrecoCompra()));
        dashboard.getTxtPrecoVendaProdutoDetalhe().setText(String.valueOf(produto.getPrecoVenda()));
        dashboard.getTxtEstoqueProdutoDetalhe().setText(String.valueOf(produto.getEstoque()));
        dashboard.getTxtDescricaoProdutoDetalhe().setText(produto.getDescricao());
    }
    
    private void limparCampos(){
        this.dashboard.getTxtCodigoProduto().setText("");
        this.dashboard.getTxtNomeProduto().setText("");
        this.dashboard.getTxtFabricanteProduto().setText("");
        this.dashboard.getComboBoxCategoria().setSelectedItem(null);
        this.dashboard.getTxtPesoProduto().setText("");
        this.dashboard.getTxtUnidadeMedidaProduto().setText("");
        this.dashboard.getTxtPrecoCompraProduto().setText("");
        this.dashboard.getTxtPrecoVendaProduto().setText("");
        this.dashboard.getTxtEstoqueProduto().setText("");
        this.dashboard.getTxtDescricaoProduto().setText("");
    }
    
    private void preencherTabela(){
        List<Produto> produtos = produtoDAO.listarProduto();
        ProdutoTableModel modeloTabela = new ProdutoTableModel(produtos);
        dashboard.getTabelaListaProduto().setModel(modeloTabela);
        atualizarTabela(produtoDAO.listarProduto());
    }
    
    
    private void atualizarTabela(List<Produto> produtos){
        produtoTableModel.setProdutos(produtos);
        dashboard.getTabelaListaProduto().repaint();
        dashboard.getTabelaListaProduto().revalidate();
        this.dashboard.getLabelProdutos().setText(String.format("%d", produtos.size()));
    }
    
    private void carregarCategoriaEditar(){
        List<Categoria> categorias =  categoriaDAO.listarCategoria();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Categoria categoria : categorias) {
            model.addElement(categoria.getCategoria());
        }
        this.dashboard.getComboBoxCategoriaEditar().setModel(model);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {
        int linhaSelecionada = this.dashboard.getTabelaListaProduto().getSelectedRow();
        if(linhaSelecionada != -1 && linhaSelecionada < produtoTableModel.getRowCount()){
            this.produto = this.produtoTableModel.getProdutos().get(linhaSelecionada);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}    
}