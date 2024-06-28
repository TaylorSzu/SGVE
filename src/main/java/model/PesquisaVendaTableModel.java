/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author taylo
 */
public class PesquisaVendaTableModel extends AbstractTableModel{

    private List<Produto> produtosTabela;
    private final String [] colunas = {"CODIGO", "NOME", "ESTOQUE", "PREÇO"};

    public PesquisaVendaTableModel(List<Produto> produtos) { 
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
            case 0: return produto.getCodigo();
            case 1: return produto.getNome();
            case 2: return produto.getEstoque();
            case 3: return produto.getPrecoVenda();
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
