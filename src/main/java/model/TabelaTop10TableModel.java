package model;

import entidades.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaTop10TableModel extends AbstractTableModel{
    
    private List<Venda> vendas;
    private final String [] colunas = {"PRODUTO", "QUANTIDADE VENDIDA"};

    public TabelaTop10TableModel(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    @Override
    public int getRowCount() {
        return vendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Venda venda = vendas.get(linha);
        switch(coluna){
            case 0 : return venda.getProduto();
            case 1 : return venda.getQuantidade();
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    @Override
    public String getColumnName(int column){ 
        return colunas[column];
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
        fireTableDataChanged();
    }
}
