package dao;

import entidades.Venda;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    CallableStatement cstmt;
    
    public void registrarVenda(Venda venda){
        String procedureCall = "{CALL sp_add_venda(?, ?, ?, ?)}";
        conn = new ConexaoMySql().obterConexao();
        
        try {
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setString(1, venda.getProduto());
            cstmt.setInt(2, venda.getQuantidade());
            cstmt.setBigDecimal(3, venda.getValorPago());
            cstmt.setString(4, venda.getPagamento());
            
            cstmt.execute();
            cstmt.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "" + erro.getMessage());
        }
    }
    
    public List<Venda> HistoricoVenda(){
        String sql = "SELECT * FROM venda";
        List<Venda> vendas = new ArrayList<>();
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Long id = rs.getLong("id");
                String produto = rs.getString("produto");
                int quantidade = rs.getInt("quantidade");
                BigDecimal valorPago = rs.getBigDecimal("valor_pago");
                String pagamento = rs.getString("pagamento");
                Date data = rs.getDate("data_venda");
                
                Venda venda = new Venda(produto, quantidade, valorPago, pagamento, data);
                venda.setId(id);
                
                vendas.add(venda);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar vendas: " + erro.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return vendas;
    }
    
    public List<Venda> listarTopProdutosVendidos() {
        List<Venda> topProdutosVendidos = new ArrayList<>();
        String sql = "SELECT produto, SUM(quantidade) AS total_vendido FROM venda GROUP BY produto ORDER BY total_vendido DESC LIMIT 10";

        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String produto = rs.getString("produto");
                int quantidade = rs.getInt("total_vendido");

                Venda venda = new Venda(produto, quantidade);

                topProdutosVendidos.add(venda);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar os top 10 produtos vendidos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }

        return topProdutosVendidos;
    }
    
    public void atualizarVenda(Venda venda) {
        String procedureCall = "{CALL sp_atualizar_venda(?, ?, ?, ?, ?)}";
        conn = new ConexaoMySql().obterConexao();

        try {
            conn = new ConexaoMySql().obterConexao();
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setLong(1, venda.getId());
            cstmt.setString(2, venda.getProduto());
            cstmt.setInt(3, venda.getQuantidade());
            cstmt.setBigDecimal(4, venda.getValorPago());
            cstmt.setString(5, venda.getPagamento());

            int linhasAfetadas = cstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Venda atualizada com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma venda encontrada com o ID especificado.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar venda: " + erro.getMessage());
        } finally {
            try {
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
    
    public void deletarVenda(Venda venda){
        String sql = "DELETE FROM venda WHERE id = ?";
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, venda.getId());

            int linhasAfetadas = pstm.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Venda excluída com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma venda encontrada com o ID especificado.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar venda: " + erro.getMessage());
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}
