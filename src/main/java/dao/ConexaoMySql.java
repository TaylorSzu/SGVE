package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySql {
    
    private Connection conn = null;
    private final String URL = "jdbc:mysql://localhost/sgve?user=Taylor&password=tos200689";
    
    public Connection obterConexao(){
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Conexão feita com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao" + erro);
            System.out.println("ouve falha na conexão");
        }
        return conn;
    }
    
    public void fecharConexao() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + erro.getMessage());
        }
    }
}
