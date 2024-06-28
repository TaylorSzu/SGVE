package model;

import log.VendaLog;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import log.VendaLog;

public class TabelaLogVendaTableModel extends AbstractTableModel {
    
    private List<VendaLog> vendaLogTabela;
    private final String[] colunas = {"AÇÃO", "PRODUTO", "QUANTIDADE", "VALOR PAGO", "PAGAMENTO", "DATA VENDA"};

    public TabelaLogVendaTableModel(List<VendaLog> vendaLog) {
        this.vendaLogTabela = vendaLog;
    }

    @Override
    public int getRowCount() {
        return vendaLogTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        VendaLog vendaLog = vendaLogTabela.get(linha);
        switch (coluna) {
            case 0: return vendaLog.getAcao();
            case 1: return vendaLog.getProduto();
            case 2: return vendaLog.getQuantidade();
            case 3: return vendaLog.getValorPago();
            case 4: return vendaLog.getPagamento();
            case 5: return vendaLog.getDataVenda();
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
    
    public List<VendaLog> getVendaLogs() {
        return vendaLogTabela;
    }
    
    public void setVendaLogs(List<VendaLog> vendaLogs) {
        this.vendaLogTabela = vendaLogs;
        fireTableDataChanged();
    }
}
