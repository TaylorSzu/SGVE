package model;

import entidades.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel{
    
    private List<Usuario> usuarios;
    private String [] colunas = {"ID", "NOME", "USUARIO", "PERFIL", "ULTIMO LOGIN"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Usuario usuario = usuarios.get(linha);
        switch (coluna) {
            case 0: return usuario.getId();
            case 1: return usuario.getNome();
            case 2: return usuario.getUsuario();
            case 3: return usuario.getPerfil();
            case 4: return usuario.getUltimoLogin();
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
    
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    
    public void setUsuarios(List<Usuario> usuario){ 
        this.usuarios = usuario;
        fireTableDataChanged();
    }
}
