package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import log.UsuarioLog;

public class TabelaLogUsuarioTableModel extends AbstractTableModel {
    
    private List<UsuarioLog> usuarioLogTabela;
    private final String[] colunas = {"AÇÃO", "NOME", "USUÁRIO", "PERFIL", "DATA REGISTRO"};

    public TabelaLogUsuarioTableModel(List<UsuarioLog> usuarioLog) {
        this.usuarioLogTabela = usuarioLog;
    }

    @Override
    public int getRowCount() {
        return usuarioLogTabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        UsuarioLog usuarioLog = usuarioLogTabela.get(linha);
        switch (coluna) {
            case 0: return usuarioLog.getAcao();
            case 1: return usuarioLog.getNome();
            case 2: return usuarioLog.getUsuario();
            case 3: return usuarioLog.getPerfil();
            case 4: return usuarioLog.getDataRegistro();
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
    
    public List<UsuarioLog> getUsuarioLogs() {
        return usuarioLogTabela;
    }
    
    public void setUsuarioLogs(List<UsuarioLog> usuarioLogs) {
        this.usuarioLogTabela = usuarioLogs;
        fireTableDataChanged();
    }
}
