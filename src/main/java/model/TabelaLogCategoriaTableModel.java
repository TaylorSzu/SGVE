package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import log.CategoriaLog;

public class TabelaLogCategoriaTableModel extends AbstractTableModel {
    
    private List<CategoriaLog> categoriaLogTabela;
    private final String[] colunas = {"AÇÃO", "CATEGORIA", "DATA REGISTRO"};

    public TabelaLogCategoriaTableModel(List<CategoriaLog> categoriaLog) {
        this.categoriaLogTabela = categoriaLog;
    }

    @Override
    public int getRowCount() {
        return categoriaLogTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        CategoriaLog categoriaLog = categoriaLogTabela.get(linha);
        switch (coluna) {
            case 0: return categoriaLog.getAcao();
            case 1: return categoriaLog.getCategoria();
            case 2: return categoriaLog.getDataRegistro();
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
    
    public List<CategoriaLog> getCategoriaLogs() {
        return categoriaLogTabela;
    }
    
    public void setCategoriaLogs(List<CategoriaLog> categoriaLogs) {
        this.categoriaLogTabela = categoriaLogs;
        fireTableDataChanged();
    }
}
