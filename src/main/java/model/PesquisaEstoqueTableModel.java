package model;

import entidades.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PesquisaEstoqueTableModel extends AbstractTableModel{

    private List<Produto> produtosTabela;
    private final String [] colunas = {"ID", "CODIGO", "NOME", "ESTOQUE"};

    public PesquisaEstoqueTableModel(List<Produto> produtos) { 
        this.produtosTabela = produtos;
    }

    @Override
    public int getRowCount() {
        return produtosTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Produto produto = produtosTabela.get(linha);
        switch (coluna) {
            case 0: return produto.getId();
            case 1: return produto.getCodigo();
            case 2: return produto.getNome();
            case 3: return produto.getEstoque();
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
    
    public List<Produto> getProdutos(){
        return produtosTabela;
    }
    
    public void setProdutos(List<Produto> produtos){ 
        this.produtosTabela = produtos;
        fireTableDataChanged();
    }
}
