
package controller;

import dao.ConexaoMySql;
import dao.LoginDAO;
import dao.UsuarioDAO;
import entidades.Perfil;
import entidades.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioTableModel;
import view.Dashboard;

public class UsuarioController implements ActionListener, MouseListener{
    private final Dashboard dashboard;
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;
    private List<Usuario> usuarios;
    private UsuarioTableModel usuarioTableModel;
    private LoginDAO loginDAO;

    public UsuarioController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.usuarioDAO = new UsuarioDAO();
        this.loginDAO = new LoginDAO();
        this.usuarios = usuarioDAO.listarUsuario();
        this.usuarioTableModel = new UsuarioTableModel(new ArrayList<>());
        dashboard.getTabelaUsuarios().setModel(usuarioTableModel);
        iniciarComboBox();
        atualizarTabela(usuarioDAO.listarUsuario());
        preencherTabela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch(acao) {
            case "salvar" : Cadastrar(); break;
            case "editar" : Editar(); break;
            case "atualizar" : Atualizar(); break;
            case "detalhes" : Detalhes(); break;
            case "excluir" : Excluir(); break;
            case "cancelar": Cancelar(); break;
        }
    }

    private void Cadastrar() {
        Usuario usuarios = usuarioLogado();
        if(loginDAO.temPermissao(usuarios)){
            CadastrarUsuario();
            limparCampos();
            atualizarTabela(usuarioDAO.listarUsuario());
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            dashboard.getTelaCadastrarUsuario().setVisible(false);
        }      
    }

    private void Editar() {
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            mostrarTelaEditar();
            preencherTelaEditar();
        }
    }
    
    private void Atualizar(){
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            EditarUsuario();
            dashboard.getTelaEditarUsuario().setVisible(false);
            JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucesso.", "Sucesso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void Detalhes(){
        if(usuario != null){
            mostrarTelaDetalhes();
            preencherTelaDetalhes();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para ver os detalhes.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void Excluir(){
        Usuario usuario = usuarioLogado();
        if(loginDAO.temPermissao(usuario)){
            if (usuario != null) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Usuario?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
                if (confirmar == JOptionPane.YES_OPTION) {
                    usuarioDAO.deletarUsuario(usuario);
                    atualizarTabela(usuarioDAO.listarUsuario());
                    preencherTabela();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um usuario para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } 
        }
    }
    
    private void Cancelar() {
        
    }
    
    private Usuario usuarioLogado(){
        String usuarioLogado = this.dashboard.getLabelUsuarioLogado().getText();
        List<Usuario> usuarios = usuarioDAO.BuscarUsuarioPorUsuario(usuarioLogado);
        return usuarios.get(0);
    }
    
    private void iniciarComboBox(){
        this.dashboard.getComboBoxPerfil().removeAllItems();
        this.dashboard.getComboBoxPerfil().addItem("Selecione o perfil");
        
        for(Perfil perfil : Perfil.values()){
            this.dashboard.getComboBoxPerfil().addItem(perfil.name());
        }
    }
    
    private void preencherTabela(){
        List<Usuario> usuarios = usuarioDAO.listarUsuario();
        UsuarioTableModel modeloTabela = new UsuarioTableModel(usuarios);
        this.dashboard.getTabelaUsuarios().setModel(modeloTabela);
        atualizarTabela(usuarioDAO.listarUsuario());
    }
    
    private void CadastrarUsuario(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        String nome, usuario1, senha, endereco, telefone, celular, perfil;
        BigDecimal salario;
        
        nome = dashboard.getTxtNomeCadastrarUsuario().getText();
        usuario1 = dashboard.getTxtUsuarioCadastrarUsuario().getText();
        senha = dashboard.getTxtSenhaCadastrarUsuario().getText();
        endereco = dashboard.getTxtEndereçoCadastrarUsuario().getText();
        telefone = dashboard.getTxtTelefoneCadastrarUsuario().getText();
        celular = dashboard.getTxtCelularCadastrarUsuario().getText();
        salario = new BigDecimal(dashboard.getTxtSalarioCadastrarUsuario().getText());
        perfil = dashboard.getComboBoxPerfil().getSelectedItem().toString();
        
        Usuario usuario = new  Usuario(nome, usuario1, senha, Perfil.valueOf(perfil), telefone, celular, endereco, salario);
        usuarioDAO.cadastrarFuncionario(usuario);
        atualizarTabela(usuarioDAO.listarUsuario());
        preencherTabela();
    }
    
    private void EditarUsuario(){
        Connection Conexao = new ConexaoMySql().obterConexao();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        String nome, usuario1, senha, endereco, telefone, celular, perfil;
        BigDecimal salario;
        
        nome = dashboard.getTxtNomeEditarUsuario().getText();
        usuario1 = dashboard.getTxtUsuarioEditarUsuario().getText();
        senha = dashboard.getTxtSenhaEditarUsuario().getText();
        endereco = dashboard.getTxtEndereçoEditarUsuario().getText();
        telefone = dashboard.getTxtTelefoneEditarUsuario().getText();
        celular = dashboard.getTxtCelularEditarUsuario().getText();
        salario = new BigDecimal(dashboard.getTxtSalarioEditarUsuario().getText());
        perfil = dashboard.getComboBoxPerfilEditar().getSelectedItem().toString();
        
        Usuario usuario = new  Usuario(nome, usuario1, senha, Perfil.valueOf(perfil), telefone, celular, endereco, salario);
        usuarioDAO.EditarFuncionario(usuario);
        atualizarTabela(usuarioDAO.listarUsuario());
        preencherTabela();
    }
    
    private void atualizarTabela(List<Usuario> usuarios){
        usuarioTableModel.setUsuarios(usuarios);
        dashboard.getTabelaUsuarios().repaint();
        dashboard.getTabelaUsuarios().revalidate();
        this.dashboard.getLabelFuncionario().setText(String.format("%d", usuarios.size()));
    }
    
    private void limparCampos(){
        this.dashboard.getTxtNomeCadastrarUsuario().setText("");
        this.dashboard.getTxtUsuarioCadastrarUsuario().setText("");
        this.dashboard.getTxtSenhaCadastrarUsuario().setText("");
        this.dashboard.getTxtEndereçoCadastrarUsuario().setText("");
        this.dashboard.getTxtSalarioCadastrarUsuario().setText("");
        this.dashboard.getTxtCelularCadastrarUsuario().setText("");
        this.dashboard.getTxtTelefoneCadastrarUsuario().setText("");
        this.dashboard.getComboBoxPerfil().setSelectedItem(null);
    }
    
    private void mostrarTelaCadastro(){
        this.dashboard.getTelaCadastrarUsuario().pack();
        this.dashboard.getTelaCadastrarUsuario().setLocationRelativeTo(dashboard);
        this.dashboard.getTelaCadastrarUsuario().setVisible(true);
    }
    
    private void mostrarTelaEditar(){
        dashboard.getTelaEditarUsuario().pack();
        dashboard.getTelaEditarUsuario().setLocationRelativeTo(null);
        dashboard.getTelaEditarUsuario().setVisible(true);
    }
    
    private void preencherTelaEditar(){
        dashboard.getTxtIdEditarUsuario().setText(String.valueOf(usuario.getId()));
        dashboard.getTxtNomeEditarUsuario().setText(usuario.getNome());
        dashboard.getTxtUsuarioEditarUsuario().setText(usuario.getUsuario());
        dashboard.getTxtSenhaEditarUsuario().setText(usuario.getSenha());
        dashboard.getTxtSalarioEditarUsuario().setText(String.valueOf(usuario.getSalario()));
        dashboard.getTxtTelefoneEditarUsuario().setText(usuario.getTelefone());
        dashboard.getTxtCelularEditarUsuario().setText(usuario.getCelular());
        dashboard.getTxtEndereçoEditarUsuario().setText(usuario.getEndereco());
        iniciarComboBox();
    }
    
    private void mostrarTelaDetalhes(){
        this.dashboard.getTelaDetalhesUsuario().pack();
        this.dashboard.getTelaDetalhesUsuario().setLocationRelativeTo(dashboard);
        this.dashboard.getTelaDetalhesUsuario().setVisible(true);
    }
    
    private void preencherTelaDetalhes(){
        dashboard.getTxtNomeDetalheUsuario().setText(usuario.getNome());
        dashboard.getTxtUsuarioDetalheUsuario().setText(usuario.getUsuario());
        dashboard.getTxtSenhaDetalheUsuario().setText(usuario.getSenha());
        dashboard.getTxtPerfilDetalheUsuario().setText(String.valueOf(usuario.getPerfil()));
        dashboard.getTxtSalarioDetalheUsuario().setText(String.valueOf(usuario.getSalario()));
        dashboard.getTxtTelefoneDetalheUsuario().setText(usuario.getTelefone());
        dashboard.getTxtCelularDetalheUsuario().setText(usuario.getCelular());
        dashboard.getTxtEndereçoDetalheUsuario().setText(usuario.getEndereco());
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int linhaSelecionada = this.dashboard.getTabelaUsuarios().getSelectedRow();
        if(linhaSelecionada != -1 && linhaSelecionada < usuarioTableModel.getRowCount()){
            this.usuario = this.usuarioTableModel.getUsuarios().get(linhaSelecionada);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
}
