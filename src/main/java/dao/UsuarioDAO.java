package dao;

import entidades.Perfil;
import entidades.Produto;
import entidades.Usuario;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    private CallableStatement cstmt;
    
    public void cadastrarFuncionario(Usuario usuario){
        String procedureCall = "{CALL sp_add_funcionario(?, ?, ?, ?, ?, ?, ?, ?)}";
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setString(1, usuario.getNome());
            cstmt.setString(2, usuario.getUsuario());
            cstmt.setString(3, usuario.getSenha());
            cstmt.setString(4, usuario.getPerfil().name());
            cstmt.setBigDecimal(5, usuario.getSalario());
            cstmt.setString(6, usuario.getTelefone());
            cstmt.setString(7, usuario.getCelular());
            cstmt.setString(8, usuario.getEndereco());
            
            cstmt.execute();
            cstmt.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "" + erro.getMessage());
        }
    }
    
    public void EditarFuncionario(Usuario usuario){
        String procedureCall = "{CALL sp_atualizar_funcionario(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setLong(1, usuario.getId());
            cstmt.setString(2, usuario.getNome());
            cstmt.setString(3, usuario.getUsuario());
            cstmt.setString(4, usuario.getSenha());
            cstmt.setString(5, usuario.getPerfil().name());
            cstmt.setBigDecimal(6, usuario.getSalario());
            cstmt.setString(7, usuario.getTelefone());
            cstmt.setString(8, usuario.getCelular());
            cstmt.setString(9, usuario.getEndereco());
            
            cstmt.execute();
            cstmt.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "" + erro.getMessage());
        }
    }
    
    public List<Usuario> listarUsuario(){
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String usuario1 = rs.getString("usuario");
                String senha = rs.getString("senha");
                Perfil perfil = Perfil.valueOf(rs.getString("perfil"));
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String celular = rs.getString("celular");
                BigDecimal salario = rs.getBigDecimal("salario");
                LocalDateTime ultimoLogin = rs.getObject("ultimo_login", LocalDateTime.class);
                
                Usuario usuario = new Usuario(nome, usuario1, senha, perfil, telefone, celular, endereco, salario);
                usuario.setId(id);
                usuario.setUltimoLogin(ultimoLogin);
                usuarios.add(usuario);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuarios: " + erro.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return usuarios;
    }
    
    public List<Usuario> BuscarUsuarioPorUsuario(String usuario){
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        List<Usuario> usuarios = new ArrayList<>();
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String usuario1 = rs.getString("usuario");
                String senha = rs.getString("senha");
                String perfil = rs.getString("perfil");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String celular = rs.getString("celular");
                BigDecimal salario = rs.getBigDecimal("salario");
                
                Usuario user = new Usuario(nome, usuario1, senha, Perfil.valueOf(perfil), telefone, celular, endereco, salario);
                user.setId(id);
                usuarios.add(user);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuarios: " + erro.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return usuarios;
    }
    
    public void deletarUsuario(Usuario usuario){
        String sql = "{CALL sp_deletar_usuario(?)}";
        
        conn = new ConexaoMySql().obterConexao();
        
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setLong(1, usuario.getId());
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void atualizarUltimoLogin(Usuario usuario){
        String sql = "UPDATE usuario SET ultimo_login = ? WHERE id = ?";
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, LocalDateTime.now().toString());
            pstm.setLong(2, usuario.getId());
            
            pstm.executeUpdate();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + erro.getMessage());
        }
    }
}
