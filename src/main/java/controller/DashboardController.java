package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import view.Dashboard;
import view.Login;

public class DashboardController implements ActionListener{

    private final Dashboard dashboard;
    private final Login login;

    public DashboardController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.login = new Login();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();
        
        switch (acao) {
            case "inicio" : painelInicio(); break;
            case "registrar venda" : painelRegistrarVenda(); break;
            case "historico de vendas" : painelHistoricoVendas(); break;
            case "adicionar produto" : painelAdicionarProduto(); break;
            case "lista de produtos" : painelListaProduto(); break;
            case "controle de estoque" : painelControleEstoque(); break;
            case "relatorio de vendas" : painelRelatorio(); break;
            case "suporte" : painelSuporte(); break;
            case "gerenciar funcionarios" : painelUsuario(); break;
            case "trocar de conta" : painelTrocarConta(); break;
            case "logs" : painelLogs(); break;
            case "novo produto" : btnNovoProduto(); break;
            case "nova venda" : btnNovaVenda(); break;
            case "cadastrar" : btnVerFuncionario(); break;
        }
    }
    
    private void painelComponentes(JPanel panel){
        this.dashboard.getPainelPrincipal().removeAll();
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
        this.dashboard.getPainelPrincipal().add(panel);
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
    }
    
    private void painelComponentes(JTabbedPane panel){
        this.dashboard.getPainelPrincipal().removeAll();
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
        this.dashboard.getPainelPrincipal().add(panel);
        this.dashboard.getPainelPrincipal().repaint();
        this.dashboard.getPainelPrincipal().revalidate();
    }
    
    private void painelInicio(){
        painelComponentes(this.dashboard.getPainelEstatisticas());
    }

    private void painelRegistrarVenda() {
        painelComponentes(this.dashboard.getPainelRegistrarVenda());
    }

    private void painelHistoricoVendas() {
        painelComponentes(this.dashboard.getPainelHistoricoVendas());
    }

    private void painelAdicionarProduto() {
        painelComponentes(this.dashboard.getPainelRegistrarProduto());
    }

    private void painelListaProduto() {
        painelComponentes(this.dashboard.getPainelListaProduto());
    }

    private void painelControleEstoque() {
        painelComponentes(this.dashboard.getPainelControleEstoque());
    }
    
    private void painelRelatorio(){
        painelComponentes(this.dashboard.getPainelRelatorio());
    }
    
    private void painelSuporte(){
        painelComponentes(this.dashboard.getPainelSuporte());
    }
    
    private void painelUsuario(){
        painelComponentes(this.dashboard.getPainelUsuario());
    }

    private void painelTrocarConta(){
        dashboard.setVisible(false);
        login.setVisible(true);
    }
    
    private void painelLogs(){
        painelComponentes(this.dashboard.getPainelLog());
    }
    
    private void btnNovoProduto() {
        painelComponentes(this.dashboard.getPainelRegistrarProduto());
    }

    private void btnNovaVenda() {
        painelComponentes(this.dashboard.getPainelRegistrarVenda());
    }

    private void btnVerFuncionario() {
        painelComponentes(this.dashboard.getPainelUsuario());
    }
}