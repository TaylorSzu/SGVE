package dao;

import entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAO {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public void CadastrarCategoria(Categoria categoria){
        String sql = "INSERT INTO categoria (categoria) VALUES (?)";
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, categoria.getCategoria());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "" + erro);
        }
    }
    
    public List<Categoria> listarCategoria(){
        String sql = "SELECT * FROM categoria";
        List<Categoria> categorias = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Long id = rs.getLong("id");
                String nome = rs.getString("categoria");
                
                Categoria categoria = new Categoria();
                categoria.setCategoria(nome);
                
                categorias.add(categoria);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + erro.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return categorias;
    }
}
