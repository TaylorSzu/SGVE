package dao;

import dto.LoginDto;
import entidades.Perfil;
import entidades.Usuario;
import exception.NegocioException;
import java.util.List;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    private final UsuarioDAO usuarioDAO;    

    public LoginDAO() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public Usuario login(LoginDto loginDto){
        List<Usuario> usuarios = usuarioDAO.BuscarUsuarioPorUsuario(loginDto.getUsername());
        
        if (usuarios == null) {
            return null;
        }   
        Usuario usuario = usuarios.get(0);
        if(validarSenha(usuario.getSenha(), loginDto.getSenha())){
            usuarioDAO.atualizarUltimoLogin(usuario);
            return usuario;
        }
        return null;
    }
    
    public boolean temPermissao(Usuario usuario){
        try {
            permissao(usuario);
            return true;
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Usuario sem permissao", 0);
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
    public void permissao(Usuario usuarioLogado){
        if (!Perfil.ADMIN.equals(usuarioLogado.getPerfil())) {
            throw new NegocioException("Sem permissao para realizar essa açao.");
        }
    }
    
    private boolean validarSenha(String usuarioSenha, String loginSenha){
        return usuarioSenha.equals(loginSenha);
    }
}
