package model;

import entidades.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendaTableModel extends AbstractTableModel{
    
    private List<Venda> vendaTabela;
    private final String [] colunas = {"ID", "PRODUTO", "QUANTIDADE", "VALOR PAGO", "FORMA DE PAGAMENTO", "DATA"};

    public VendaTableModel(List<Venda> vendas) { 
        this.vendaTabela = vendas;
    }

    @Override
    public int getRowCount() {
        return vendaTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Venda venda = vendaTabela.get(linha);
        switch (coluna) {
            case 0: return venda.getId();
            case 1: return venda.getProduto();
            case 2: return venda.getQuantidade();
            case 3: return venda.getValorPago();
            case 4: return venda.getPagamento();
            case 5: return venda.getData();
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
    
    public List<Venda> getProdutos(){
        return vendaTabela;
    }
    
    public void setVendas(List<Venda> vendas){ 
        this.vendaTabela = vendas;
        fireTableDataChanged();
    }
}