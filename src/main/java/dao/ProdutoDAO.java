package dao;

import dao.ConexaoMySql;
import entidades.Produto;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    private CallableStatement cstmt;
    
    public void cadastrarProduto(Produto produto) {
        String procedureCall = "{CALL sp_add_produto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        conn = new ConexaoMySql().obterConexao();

        try {
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setLong(1, produto.getCodigo());
            cstmt.setString(2, produto.getNome());
            cstmt.setString(3, produto.getFabricante());
            cstmt.setInt(4, produto.getEstoque());
            cstmt.setString(5, produto.getCategoria());
            cstmt.setBigDecimal(6, produto.getPeso());
            cstmt.setBigDecimal(7, produto.getPrecoCompra());
            cstmt.setBigDecimal(8, produto.getPrecoVenda());
            cstmt.setString(9, produto.getUnidadeMedida());
            cstmt.setString(10, produto.getDescricao());

            cstmt.execute();
            cstmt.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "" + erro.getMessage());
        }
    }
    
    public List<Produto> listarProduto(){
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();
        
        conn = new ConexaoMySql().obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Long id = rs.getLong("id");
                Long codigo = rs.getLong("codigo");
                String nome = rs.getString("nome");
                String fabricante = rs.getString("fabricante");
                int estoque = rs.getInt("estoque");
                String categoria = rs.getString("categoria");
                BigDecimal peso = rs.getBigDecimal("peso");
                BigDecimal preco_compra = rs.getBigDecimal("preco_compra");
                BigDecimal preco_venda = rs.getBigDecimal("preco_venda");
                String unidadeMedida = rs.getString("unidade_medida");
                String descricao = rs.getString("descricao");
                
                Produto produto = new Produto(id, codigo, nome, fabricante, categoria, peso, unidadeMedida, preco_compra, preco_venda, estoque, descricao);
                produto.setId(id);
                produtos.add(produto);
            }
        } catch (SQLException erro) {
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
        return produtos;
    }
    
    public Produto buscarProdutoPorNome(String nome) {
        Produto produto = null;
        String sql = "SELECT * FROM produto WHERE nome = ?";

        try (Connection conn = new ConexaoMySql().obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getLong("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setFabricante(rs.getString("fabricante"));
                produto.setEstoque(rs.getInt("estoque"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setPeso(rs.getBigDecimal("peso"));
                produto.setPrecoCompra(rs.getBigDecimal("preco_compra"));
                produto.setPrecoVenda(rs.getBigDecimal("preco_venda"));
                produto.setUnidadeMedida(rs.getString("unidade_medida"));
                produto.setDescricao(rs.getString("descricao"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage());
        }
        return produto;
    }
    
    public void atualizarProduto(Produto produto) {
        String procedureCall = "{CALL sp_atualizar_produto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        Connection conn = new ConexaoMySql().obterConexao();
        
        try {
            cstmt = conn.prepareCall(procedureCall);
            cstmt.setLong(1, produto.getId());
            cstmt.setLong(2, produto.getCodigo());
            cstmt.setString(3, produto.getNome());
            cstmt.setString(4, produto.getFabricante());
            cstmt.setInt(5, produto.getEstoque());
            cstmt.setString(6, produto.getCategoria());
            cstmt.setBigDecimal(7, produto.getPeso());
            cstmt.setBigDecimal(8, produto.getPrecoCompra());
            cstmt.setBigDecimal(9, produto.getPrecoVenda());
            cstmt.setString(10, produto.getUnidadeMedida());
            cstmt.setString(11, produto.getDescricao());
            
            int linhasAfetadas = cstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o ID especificado.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + erro.getMessage());
        } finally {
            try {
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }    
    
    public void atualizarEstoque(Produto produto){
        String sql = "UPDATE produto SET estoque=? WHERE id=?";
        conn = new ConexaoMySql().obterConexao();
        
        try {
            if(produto.getId() != null){
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, produto.getEstoque());
                pstm.setLong(2, produto.getId());
                
                int linhasAfetadas = pstm.executeUpdate();
                if (linhasAfetadas > 0) {
                    JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(null, "ID do produto não pode ser nulo.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o ID especificado.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + erro.getMessage());
        }finally {
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
    
    public void atualizarEstoqueProduto(String nomeProduto, int quantidadeVendida) {
        String sql = "UPDATE produto SET estoque = estoque - ? WHERE nome = ?";
        conn = new ConexaoMySql().obterConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, quantidadeVendida);
            pstm.setString(2, nomeProduto);
            pstm.executeUpdate();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar estoque do produto: " + erro.getMessage());
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }

    public void deletarProduto(Produto produto){
        String sql = "{CALL sp_deletar_produto(?)}";
        
        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setLong(1, produto.getId());
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
        }
    }
}
