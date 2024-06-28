package controller;

import dao.CategoriaDAO;
import dao.ConexaoMySql;
import entidades.Categoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import view.Dashboard;

public class CategoriaController implements ActionListener{

    private final Dashboard dashboard;
    private CategoriaDAO categoriaDAO;
    
    public CategoriaController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.categoriaDAO = new CategoriaDAO();
        carregarCategoria();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "salvar" : painelSalvar(); break;
            case "cancelar" : painelCancelar(); break;
        }
    }

    private void painelSalvar() {
        cadastrarCategoria(dashboard);
        fechar();
    }
    
    private void painelCancelar() {
        fechar();
    }
    
    private void cadastrarCategoria(Dashboard view){
        Connection conexao = new ConexaoMySql().obterConexao();
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        String nome;
        
        nome = view.getTxtNomeCategoria().getText();
        
        Categoria categoria = new Categoria();
        categoria.setCategoria(nome);
        
        categoriaDAO.CadastrarCategoria(categoria);
        carregarCategoria();
    }
    
    private void carregarCategoria(){
        List<Categoria> categorias = categoriaDAO.listarCategoria();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Categoria categoria : categorias) {
            model.addElement(categoria.getCategoria());
        }
        this.dashboard.getComboBoxCategoria().setModel(model);
    }
    
    private void fechar(){
        dashboard.getTxtNomeCategoria().setText("");
        dashboard.getTelaCategoria().setVisible(false);
    }
}
