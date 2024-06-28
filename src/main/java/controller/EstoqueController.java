package controller;

import dao.ConexaoMySql;
import dao.LoginDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import entidades.Produto;
import entidades.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import model.PesquisaEstoqueTableModel;
import model.ProdutoTableModel;
import view.Dashboard;

public class EstoqueController implements ActionListener, KeyListener, MouseListener {
    
    private Dashboard dashboard;
    private ProdutoDAO produtoDAO;
    private Produto produto;
    private Produto produtoEmEdicao;
    private List<Produto> produtos;
    private PesquisaEstoqueTableModel pesquisaEstoqueTableModel;
    private LoginDAO loginDAO;
    private UsuarioDAO usuarioDAO;

    public EstoqueController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.produtoDAO = new ProdutoDAO();
        this.loginDAO = new LoginDAO();
        this.usuarioDAO = new UsuarioDAO();
        this.produtos = produtoDAO.listarProduto();
        this.pesquisaEstoqueTableModel = new PesquisaEstoqueTableModel(new ArrayList<>());
        dashboard.getTxtPesquisaProdutoEstoque().addKeyListener(this);
        dashboard.getTabelaControleEstoque().addMouseListener(this);
        dashboard.getTabelaControleEstoque().setModel(pesquisaEstoqueTableModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "adicionar" : adicionar(); break;
            case "atualizar" : atualizar(); break;
        }
    }

    private void adicionar() {
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            atualizarEstoque();
            limparCampos();
        }
    }
    
    private void atualizar(){
        atualizarTabelaEstoque(produtoDAO.listarProduto());
    }
    
    private Usuario usuarioLogado(){
        String usuarioLogado = this.dashboard.getLabelUsuarioLogado().getText();
        List<Usuario> usuarios = usuarioDAO.BuscarUsuarioPorUsuario(usuarioLogado);
        return usuarios.get(0);
    }
        
    private void atualizarEstoque(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        String idStr;
        Long id;
        int estoque;
        
        idStr = dashboard.getTxtProdutoEstoqueID().getText();
        id = Long.parseLong(idStr);
        estoque = (int) dashboard.getSpinnerQuantidadeEstoque().getValue();
        
        if(estoque > 0){
            Produto produto = new Produto();
            produto.setId(id);
            produto.setEstoque(estoque);
      
            produtoDAO.atualizarEstoque(produto);
            List<Produto> produtosAtualizados = produtoDAO.listarProduto();
            ProdutoTableModel modeloTabela = new ProdutoTableModel(produtosAtualizados);
            dashboard.getTabelaListaProduto().setModel(modeloTabela);
            atualizarTabelaProduto(produtoDAO.listarProduto());
        }else{
            JOptionPane.showMessageDialog(null, "O estoque deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void atualizarTabelaProduto(List<Produto> produtos){
        ProdutoTableModel produtoTableModel = new ProdutoTableModel(produtos);
        dashboard.getTabelaListaProduto().repaint();
        dashboard.getTabelaListaProduto().revalidate();
    }
    
    private void atualizarTabelaEstoque(List<Produto> produtos){
        pesquisaEstoqueTableModel.setProdutos(produtos);
        dashboard.getTabelaControleEstoque().repaint();
        dashboard.getTabelaControleEstoque().revalidate();
    }
    
    private void pesquisar() {
        String pesquisa = dashboard.getTxtPesquisaProdutoEstoque().getText().toLowerCase().trim();
        List<Produto> produtosEncontrados = produtos.stream()
                .filter(p -> p.getNome().toLowerCase().contains(pesquisa))
                .collect(Collectors.toList());
        System.out.println("Produto Encontrado");
        atualizarTabela(produtosEncontrados);
    }
    
    private void atualizarTabela(List<Produto> produtos) {
        pesquisaEstoqueTableModel.setProdutos(produtos);
        dashboard.getTabelaControleEstoque().repaint();
        dashboard.getTabelaControleEstoque().revalidate();
    }
    
    private void selecionarProduto() {
        int linhaSelecionada = dashboard.getTabelaControleEstoque().getSelectedRow();
        if (linhaSelecionada != -1) {
            Long id = (Long) dashboard.getTabelaControleEstoque().getValueAt(linhaSelecionada, 0);
            String nomeProduto = (String) dashboard.getTabelaControleEstoque().getValueAt(linhaSelecionada, 2);
            int quantidadeEstoque = (Integer) dashboard.getTabelaControleEstoque().getValueAt(linhaSelecionada, 3);
            dashboard.getTxtProdutoEstoqueID().setText(String.valueOf(id));
            dashboard.getTxtProdutoEstoque().setText(nomeProduto);
            dashboard.getSpinnerQuantidadeEstoque().setValue(quantidadeEstoque);
        }
    }
    
    private void limparCampos(){
        dashboard.getTxtPesquisaProdutoEstoque().setText("");
        dashboard.getTxtProdutoEstoqueID().setText("");
        dashboard.getTxtProdutoEstoque().setText("");
        dashboard.getSpinnerQuantidadeEstoque().setValue(0);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        pesquisar();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        selecionarProduto();
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