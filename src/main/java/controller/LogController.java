package controller;

import dao.LogDAO;
import java.util.ArrayList;
import java.util.List;
import log.ProdutoLog;
import log.VendaLog;
import log.UsuarioLog;
import log.CategoriaLog;
import model.TabelaLogProdutoTableModel;
import model.TabelaLogVendaTableModel;
import model.TabelaLogUsuarioTableModel;
import model.TabelaLogCategoriaTableModel;
import view.Dashboard;

public class LogController {
    private final Dashboard dashboard;
    private LogDAO logDAO;
    private TabelaLogProdutoTableModel logProdutoTableModel;
    private TabelaLogVendaTableModel logVendaTableModel;
    private TabelaLogUsuarioTableModel logUsuarioTableModel;
    private TabelaLogCategoriaTableModel logCategoriaTableModel;

    public LogController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.logDAO = new LogDAO();
        this.logProdutoTableModel = new TabelaLogProdutoTableModel(new ArrayList<>());
        this.logVendaTableModel = new TabelaLogVendaTableModel(new ArrayList<>());
        this.logUsuarioTableModel = new TabelaLogUsuarioTableModel(new ArrayList<>());
        this.logCategoriaTableModel = new TabelaLogCategoriaTableModel(new ArrayList<>());

        dashboard.getTabelaLogProduto().setModel(logProdutoTableModel);
        dashboard.getTabelaLogVenda().setModel(logVendaTableModel);
        dashboard.getTabelaLogUsuario().setModel(logUsuarioTableModel);
        dashboard.getTabelaLogCategoria().setModel(logCategoriaTableModel);

        preencherLogProduto();
        preencherLogVenda();
        preencherLogUsuario();
        preencherLogCategoria();
    }

    private void preencherLogProduto(){
        List<ProdutoLog> produtoLog = logDAO.LogProduto();
        TabelaLogProdutoTableModel modeloTabela = new TabelaLogProdutoTableModel(produtoLog);
        dashboard.getTabelaLogProduto().setModel(modeloTabela);
        atualizarLogProduto(logDAO.LogProduto());
    }
    
    private void atualizarLogProduto(List<ProdutoLog> produtoLogs){
        logProdutoTableModel.setProdutoLogs(produtoLogs);
        dashboard.getTabelaLogProduto().repaint();
        dashboard.getTabelaLogProduto().revalidate();
    }

    private void preencherLogVenda(){
        List<VendaLog> vendaLog = logDAO.LogVenda();
        TabelaLogVendaTableModel modeloTabela = new TabelaLogVendaTableModel(vendaLog);
        dashboard.getTabelaLogVenda().setModel(modeloTabela);
        atualizarLogVenda(logDAO.LogVenda());
    }

    private void atualizarLogVenda(List<VendaLog> vendaLogs){
        logVendaTableModel.setVendaLogs(vendaLogs);
        dashboard.getTabelaLogVenda().repaint();
        dashboard.getTabelaLogVenda().revalidate();
    }

    private void preencherLogUsuario(){
        List<UsuarioLog> usuarioLog = logDAO.LogUsuario();
        TabelaLogUsuarioTableModel modeloTabela = new TabelaLogUsuarioTableModel(usuarioLog);
        dashboard.getTabelaLogUsuario().setModel(modeloTabela);
        atualizarLogUsuario(logDAO.LogUsuario());
    }

    private void atualizarLogUsuario(List<UsuarioLog> usuarioLogs){
        logUsuarioTableModel.setUsuarioLogs(usuarioLogs);
        dashboard.getTabelaLogUsuario().repaint();
        dashboard.getTabelaLogUsuario().revalidate();
    }

    private void preencherLogCategoria(){
        List<CategoriaLog> categoriaLog = logDAO.LogCategoria();
        TabelaLogCategoriaTableModel modeloTabela = new TabelaLogCategoriaTableModel(categoriaLog);
        dashboard.getTabelaLogCategoria().setModel(modeloTabela);
        atualizarLogCategoria(logDAO.LogCategoria());
    }

    private void atualizarLogCategoria(List<CategoriaLog> categoriaLogs){
        logCategoriaTableModel.setCategoriaLogs(categoriaLogs);
        dashboard.getTabelaLogCategoria().repaint();
        dashboard.getTabelaLogCategoria().revalidate();
    }
}
