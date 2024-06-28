package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import log.CategoriaLog;
import log.ProdutoLog;
import log.UsuarioLog;
import log.VendaLog;

public class LogDAO {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public List<ProdutoLog> LogProduto() {
        String sql = "SELECT * FROM log_produto";
        List<ProdutoLog> logs = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String acao = rs.getString("acao");
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fabricante = rs.getString("fabricante");
                int estoque = rs.getInt("estoque");
                String categoria = rs.getString("categoria");
                LocalDateTime dataRegistro = rs.getObject("data_registro", LocalDateTime.class);

                ProdutoLog log = new ProdutoLog(acao, codigo, nome, fabricante, estoque, categoria, dataRegistro);
                logs.add(log);
            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return logs;
    }
    
    public List<VendaLog> LogVenda() {
        String sql = "SELECT * FROM log_venda";
        List<VendaLog> logs = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String acao = rs.getString("acao");
                String produto = rs.getString("produto");
                int quantidade = rs.getInt("quantidade");
                BigDecimal valorPago = rs.getBigDecimal("valor_pago");
                String pagamento = rs.getString("pagamento");
                LocalDateTime dataVenda = rs.getObject("data_venda", LocalDateTime.class);

                VendaLog log = new VendaLog(acao, produto, quantidade, valorPago, pagamento, dataVenda);
                logs.add(log);
            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return logs;
    }
    
    public List<UsuarioLog> LogUsuario() {
        String sql = "SELECT * FROM log_usuario";
        List<UsuarioLog> logs = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String acao = rs.getString("acao");
                String nome = rs.getString("nome");
                String usuario = rs.getString("usuario");
                String perfil = rs.getString("perfil");
                LocalDateTime dataRegistro = rs.getObject("data_registro", LocalDateTime.class);

                UsuarioLog log = new UsuarioLog(acao, nome, usuario, perfil, dataRegistro);
                logs.add(log);
            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return logs;
    }
    
    public List<CategoriaLog> LogCategoria() {
        String sql = "SELECT * FROM log_categoria";
        List<CategoriaLog> logs = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String acao = rs.getString("acao");
                String categoria = rs.getString("categoria");
                LocalDateTime dataRegistro = rs.getObject("data_registro", LocalDateTime.class);

                CategoriaLog log = new CategoriaLog(acao, categoria, dataRegistro);
                logs.add(log);
            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return logs;
    }
}
