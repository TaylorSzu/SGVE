package controller;

import dao.LoginDAO;
import dao.UsuarioDAO;
import dto.LoginDto;
import entidades.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Dashboard;
import view.Login;

public class LoginController implements ActionListener{
    
    private final Login login;
    private final LoginDAO loginDAO;
    private UsuarioDAO usuarioDAO;

    public LoginController(Login login) {
        this.login = login;
        loginDAO = new LoginDAO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch(acao) {
            case "login": login(); break;
            case "cancelar": cancelar(); break;                                
        }
    }

    private void login() {
        String usuarioTxt = login.getTxtUsuarioLogin().getText();
        String senhaTxt = login.getTxtSenhaLogin().getText();
        
        if(usuarioTxt.equals("") || senhaTxt.equals("")){
            JOptionPane.showMessageDialog(null, "Username e senha devem ser preenchido");
            return;
        }
        
        LoginDto loginDto = new LoginDto(usuarioTxt, senhaTxt);
        Usuario usuario = loginDAO.login(loginDto);
        
        if(usuarioTxt != null){
            System.out.println("Sucesso: " + usuario.getUsuario());
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            dashboard.getLabelUsuarioLogado().setText(usuario.getUsuario());
            this.login.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Username ou senha incorreta.");
        }
    }

    private void cancelar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tens certeza que desejas sair?","Sair do login", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION) System.exit(0);
    }
}