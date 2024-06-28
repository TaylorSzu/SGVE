package model;

import log.ProdutoLog;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import log.ProdutoLog;

public class TabelaLogProdutoTableModel extends AbstractTableModel {
    
    private List<ProdutoLog> produtoLogTabela;
    private final String[] colunas = {"AÇÃO", "CÓDIGO", "NOME", "FABRICANTE", "ESTOQUE", "CATEGORIA", "DATA REGISTRO"};

    public TabelaLogProdutoTableModel(List<ProdutoLog> produtoLog) {
        this.produtoLogTabela = produtoLog;
    }

    @Override
    public int getRowCount() {
        return produtoLogTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        ProdutoLog produtoLog = produtoLogTabela.get(linha);
        switch (coluna) {
            case 0: return produtoLog.getAcao();
            case 1: return produtoLog.getCodigo();
            case 2: return produtoLog.getNome();
            case 3: return produtoLog.getFabricante();
            case 4: return produtoLog.getEstoque();
            case 5: return produtoLog.getCategoria();
            case 6: return produtoLog.getDataRegistro();
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public List<ProdutoLog> getProdutoLogs() {
        return produtoLogTabela;
    }
    
    public void setProdutoLogs(List<ProdutoLog> produtoLogs) {
        this.produtoLogTabela = produtoLogs;
        fireTableDataChanged();
    }
}
