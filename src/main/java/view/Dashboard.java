package view;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import controller.CategoriaController;
import controller.DashboardController;
import controller.EstoqueController;
import controller.LogController;
import controller.ProdutoController;
import controller.UsuarioController;
import controller.VendaController;
import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Dashboard extends javax.swing.JFrame {

    private DashboardController dashboardController;
    private CategoriaController categoriaController;
    private ProdutoController produtoController;
    private EstoqueController estoqueController;
    private VendaController vendaController;
    private UsuarioController usuarioController;
    private LogController logController;
    
    public Dashboard() {
        initComponents();
        this.dashboardController = new DashboardController(this);
        this.categoriaController = new CategoriaController(this);
        this.produtoController = new ProdutoController(this);
        this.estoqueController = new EstoqueController(this);
        this.vendaController = new VendaController(this);
        this.usuarioController = new UsuarioController(this);
        this.logController = new LogController(this);
        setLocationRelativeTo(null);
        eventosDashboard();
        eventosCategoria();
        eventosProduto();
        eventosEstoque();
        eventosVenda();
        eventosUsuario();
    }
    
    private void eventosDashboard(){
        Inicio.addActionListener(dashboardController);
        RegistrarVenda.addActionListener(dashboardController);
        HistoricoVendas.addActionListener(dashboardController);
        AdicionarProduto.addActionListener(dashboardController);
        ListaProduto.addActionListener(dashboardController);
        ControleEstoque.addActionListener(dashboardController);
        RelatorioVendas.addActionListener(dashboardController);
        Suporte.addActionListener(dashboardController);
        funcionario.addActionListener(dashboardController);
        TrocarConta.addActionListener(dashboardController);
        logs.addActionListener(dashboardController);
        btnNovoProduto.addActionListener(dashboardController);
        btnNovaVenda.addActionListener(dashboardController);
        btnVerFuncionario.addActionListener(dashboardController);
    }
    
    private void eventosProduto(){
        btnCadastrarProduto.addActionListener(produtoController);
        btnDetalheProduto.addActionListener(produtoController);
        btnEditarProduto.addActionListener(produtoController);
        btnExcluirProduto.addActionListener(produtoController);
        btnCancelarProduto.addActionListener(produtoController);
        btnSalvarProdutoEditar.addActionListener(produtoController);
        btnAtualizarListaProduto.addActionListener(produtoController);
        tabelaListaProduto.addMouseListener(produtoController);
    }
    
    private void eventosEstoque(){
        btnAddEstoque.addActionListener(estoqueController);
        btnAtualizarControleEstoque.addActionListener(estoqueController);
        tabelaControleEstoque.addMouseListener(estoqueController);
    }
    
    private void eventosVenda(){
        btnVenderVenda.addActionListener(vendaController);
        btnCancelarVenda.addActionListener(vendaController);
        btnExcluirVenda.addActionListener(vendaController);
        tabelaHistoricoVendas.addMouseListener(vendaController);
    }
    
    private void eventosUsuario(){
        btnSalvarUsuario.addActionListener(usuarioController);
        btnEditarUsuario.addActionListener(usuarioController);
        btnDeatlhesUsuario.addActionListener(usuarioController);
        btnExcluirUsuario.addActionListener(usuarioController);
        tabelaUsuarios.addMouseListener(usuarioController);
    }
    
    private void eventosCategoria(){
        btnSalvarCategoria.addActionListener(categoriaController);
        btnCancelarCategoria.addActionListener(categoriaController);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCategoria = new javax.swing.JDialog();
        jLabel34 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txtNomeCategoria = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnCancelarCategoria = new javax.swing.JButton();
        btnSalvarCategoria = new javax.swing.JButton();
        telaEditarProduto = new javax.swing.JDialog();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtNomeProdutoEditar = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtFabricanteProdutoEditar = new javax.swing.JTextField();
        txtCodigoProdutoEditar = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        comboBoxCategoriaEditar = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        txtPesoProdutoEditar = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtUnidadeMedidaProdutoEditar = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtPrecoCompraProdutoEditar = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtPrecoVendaProdutoEditar = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        btnCancelarEditar = new javax.swing.JButton();
        btnSalvarProdutoEditar = new javax.swing.JButton();
        txtIdProdutoEditar = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoProdutoEditar = new javax.swing.JTextArea();
        telaDetalheProduto = new javax.swing.JDialog();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtNomeProdutoDetalhe = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtFabricanteProdutoDetalhe = new javax.swing.JTextField();
        txtCodigoProdutoDetalhe = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtPesoProdutoDetalhe = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtUnidadeMedidaProdutoDetalhe = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtPrecoCompraProdutoDetalhe = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtPrecoVendaProdutoDetalhe = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtEstoqueProdutoDetalhe = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescricaoProdutoDetalhe = new javax.swing.JTextArea();
        txtCategoriaProdutoDetalhe = new javax.swing.JTextField();
        telaCadastrarUsuario = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        txtNomeCadastrarUsuario = new javax.swing.JTextField();
        txtUsuarioCadastrarUsuario = new javax.swing.JTextField();
        txtSenhaCadastrarUsuario = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        comboBoxPerfil = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();
        txtSalarioCadastrarUsuario = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtTelefoneCadastrarUsuario = new javax.swing.JTextField();
        txtEndereçoCadastrarUsuario = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txtCelularCadastrarUsuario = new javax.swing.JTextField();
        telaDetalhesUsuario = new javax.swing.JDialog();
        jLabel73 = new javax.swing.JLabel();
        txtNomeDetalheUsuario = new javax.swing.JTextField();
        txtUsuarioDetalheUsuario = new javax.swing.JTextField();
        txtSenhaDetalheUsuario = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        txtSalarioDetalheUsuario = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        txtTelefoneDetalheUsuario = new javax.swing.JTextField();
        txtEndereçoDetalheUsuario = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        txtCelularDetalheUsuario = new javax.swing.JTextField();
        txtPerfilDetalheUsuario = new javax.swing.JTextField();
        telaEditarUsuario = new javax.swing.JDialog();
        jLabel82 = new javax.swing.JLabel();
        txtNomeEditarUsuario = new javax.swing.JTextField();
        txtUsuarioEditarUsuario = new javax.swing.JTextField();
        txtSenhaEditarUsuario = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        comboBoxPerfilEditar = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSalvarUsuarioEditar = new javax.swing.JButton();
        txtSalarioEditarUsuario = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtTelefoneEditarUsuario = new javax.swing.JTextField();
        txtEndereçoEditarUsuario = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtCelularEditarUsuario = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txtIdEditarUsuario = new javax.swing.JTextField();
        painelPrincipal = new javax.swing.JPanel();
        painelEstatisticas = new javax.swing.JPanel();
        panel2 = new view.Panel();
        btnNovoProduto = new javax.swing.JButton();
        labelProdutos = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnVerProduto = new javax.swing.JButton();
        panel3 = new view.Panel();
        jLabel62 = new javax.swing.JLabel();
        labelVenda = new javax.swing.JLabel();
        btnNovaVenda = new javax.swing.JButton();
        btnVerVenda = new javax.swing.JButton();
        panel4 = new view.Panel();
        btnVerRelatorio = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        labelUsuarioLogado = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        panel5 = new view.Panel();
        jLabel92 = new javax.swing.JLabel();
        btnVerFuncionario = new javax.swing.JButton();
        btnNovoFuncionario = new javax.swing.JButton();
        labelFuncionario = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaTop10 = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        painelRegistrarVenda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaRegistrarVenda = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisarProdutoVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProdutoVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spinnerQuantidadeVenda = new javax.swing.JSpinner();
        txtValorPagoVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboBoxPagamento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnCancelarVenda = new javax.swing.JButton();
        btnVenderVenda = new javax.swing.JButton();
        panel1 = new view.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelValorPago = new javax.swing.JLabel();
        labelTroco = new javax.swing.JLabel();
        labelTotalVenda = new javax.swing.JLabel();
        txtEstoqueAtualVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        painelListaProduto = new javax.swing.JPanel();
        btnExcluirProduto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaListaProduto = new javax.swing.JTable();
        btnDetalheProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnAtualizarListaProduto = new javax.swing.JButton();
        painelHistoricoVendas = new javax.swing.JPanel();
        btnExcluirVenda = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaHistoricoVendas = new javax.swing.JTable();
        painelControleEstoque = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisaProdutoEstoque = new javax.swing.JTextField();
        txtProdutoEstoque = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spinnerQuantidadeEstoque = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaControleEstoque = new javax.swing.JTable();
        btnAddEstoque = new javax.swing.JButton();
        btnCancelarEstoque = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtProdutoEstoqueID = new javax.swing.JTextField();
        btnAtualizarControleEstoque = new javax.swing.JButton();
        painelRegistrarProduto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();
        txtFabricanteProduto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        txtPrecoCompraProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEstoqueProduto = new javax.swing.JTextField();
        txtPesoProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        txtUnidadeMedidaProduto = new javax.swing.JTextField();
        btnCancelarProduto = new javax.swing.JButton();
        txtPrecoVendaProduto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricaoProduto = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        painelRelatorio = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabelaRealorioMes = new javax.swing.JTable();
        txtPesquisarPorDataMes = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        labelLucroPesquisado = new javax.swing.JLabel();
        painelSuporte = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        painelUsuario = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnCancelarUsuario = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnDeatlhesUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        painelLog = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelaLogProduto = new javax.swing.JTable();
        jLabel94 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabelaLogVenda = new javax.swing.JTable();
        jLabel95 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabelaLogUsuario = new javax.swing.JTable();
        jLabel96 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tabelaLogCategoria = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        Menubar = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        Inicio2 = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        RegistrarVenda = new javax.swing.JMenuItem();
        HistoricoVendas = new javax.swing.JMenuItem();
        RelatorioVendas = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenu();
        AdicionarProduto = new javax.swing.JMenuItem();
        ListaProduto = new javax.swing.JMenuItem();
        ControleEstoque = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        funcionario = new javax.swing.JMenuItem();
        Configurações = new javax.swing.JMenu();
        Tema = new javax.swing.JMenu();
        ModoClaro = new javax.swing.JMenuItem();
        ModoEscuro = new javax.swing.JMenuItem();
        TrocarConta = new javax.swing.JMenuItem();
        logs = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        Suporte = new javax.swing.JMenuItem();

        telaCategoria.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        telaCategoria.setMinimumSize(new java.awt.Dimension(720, 280));
        telaCategoria.setUndecorated(true);

        jLabel34.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("NOVA CATEGORIA");

        jTextField4.setEditable(false);
        jTextField4.setText("0");

        jLabel35.setText("Id");

        jLabel36.setText("Nome");

        btnCancelarCategoria.setText("Cancelar");
        btnCancelarCategoria.setPreferredSize(new java.awt.Dimension(115, 45));

        btnSalvarCategoria.setText("Salvar");
        btnSalvarCategoria.setPreferredSize(new java.awt.Dimension(99, 45));

        javax.swing.GroupLayout telaCategoriaLayout = new javax.swing.GroupLayout(telaCategoria.getContentPane());
        telaCategoria.getContentPane().setLayout(telaCategoriaLayout);
        telaCategoriaLayout.setHorizontalGroup(
            telaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaCategoriaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(telaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        telaCategoriaLayout.setVerticalGroup(
            telaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel38.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("EDITAR PRODUTO");

        jLabel39.setText("Nome");

        jLabel40.setText("Fabricante");

        jLabel41.setText("Codigo");

        jLabel42.setText("Categoria");

        jLabel43.setText("Peso");

        jLabel44.setText("Unidade de Medida");

        txtUnidadeMedidaProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeMedidaProdutoEditarActionPerformed(evt);
            }
        });

        jLabel45.setText("Preço de Compra");

        txtPrecoCompraProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCompraProdutoEditarActionPerformed(evt);
            }
        });

        jLabel46.setText("Preço de Venda");

        txtPrecoVendaProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaProdutoEditarActionPerformed(evt);
            }
        });

        jLabel48.setText("Descrição");

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.setPreferredSize(new java.awt.Dimension(77, 45));
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        btnSalvarProdutoEditar.setText("Salvar");
        btnSalvarProdutoEditar.setPreferredSize(new java.awt.Dimension(77, 45));
        btnSalvarProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoEditarActionPerformed(evt);
            }
        });

        txtIdProdutoEditar.setEditable(false);
        txtIdProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoEditarActionPerformed(evt);
            }
        });

        jLabel47.setText("Id");

        txtDescricaoProdutoEditar.setColumns(20);
        txtDescricaoProdutoEditar.setRows(5);
        jScrollPane2.setViewportView(txtDescricaoProdutoEditar);

        javax.swing.GroupLayout telaEditarProdutoLayout = new javax.swing.GroupLayout(telaEditarProduto.getContentPane());
        telaEditarProduto.getContentPane().setLayout(telaEditarProdutoLayout);
        telaEditarProdutoLayout.setHorizontalGroup(
            telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProdutoEditar))
                    .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFabricanteProdutoEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoProdutoEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                        .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxCategoriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesoProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnidadeMedidaProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoCompraProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoVendaProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaEditarProdutoLayout.setVerticalGroup(
            telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEditarProdutoLayout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricanteProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCategoriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(txtPesoProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtUnidadeMedidaProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtPrecoCompraProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVendaProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarProdutoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jLabel50.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("DETALHES DO PRODUTO");

        jLabel51.setText("Nome");

        txtNomeProdutoDetalhe.setEditable(false);

        jLabel52.setText("Fabricante");

        txtFabricanteProdutoDetalhe.setEditable(false);

        txtCodigoProdutoDetalhe.setEditable(false);

        jLabel53.setText("Codigo");

        jLabel54.setText("Categoria");

        jLabel55.setText("Peso");

        txtPesoProdutoDetalhe.setEditable(false);
        txtPesoProdutoDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoProdutoDetalheActionPerformed(evt);
            }
        });

        jLabel56.setText("Unidade de Medida");

        txtUnidadeMedidaProdutoDetalhe.setEditable(false);
        txtUnidadeMedidaProdutoDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeMedidaProdutoDetalheActionPerformed(evt);
            }
        });

        jLabel57.setText("Preço de Compra");

        txtPrecoCompraProdutoDetalhe.setEditable(false);
        txtPrecoCompraProdutoDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCompraProdutoDetalheActionPerformed(evt);
            }
        });

        jLabel58.setText("Preço de Venda");

        txtPrecoVendaProdutoDetalhe.setEditable(false);
        txtPrecoVendaProdutoDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaProdutoDetalheActionPerformed(evt);
            }
        });

        jLabel59.setText("Estoque");

        txtEstoqueProdutoDetalhe.setEditable(false);
        txtEstoqueProdutoDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueProdutoDetalheActionPerformed(evt);
            }
        });

        jLabel60.setText("Descrição");

        txtDescricaoProdutoDetalhe.setEditable(false);
        txtDescricaoProdutoDetalhe.setColumns(20);
        txtDescricaoProdutoDetalhe.setRows(5);
        jScrollPane4.setViewportView(txtDescricaoProdutoDetalhe);

        txtCategoriaProdutoDetalhe.setEditable(false);
        txtCategoriaProdutoDetalhe.setPreferredSize(new java.awt.Dimension(63, 30));

        javax.swing.GroupLayout telaDetalheProdutoLayout = new javax.swing.GroupLayout(telaDetalheProduto.getContentPane());
        telaDetalheProduto.getContentPane().setLayout(telaDetalheProdutoLayout);
        telaDetalheProdutoLayout.setHorizontalGroup(
            telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProdutoDetalhe))
                    .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFabricanteProdutoDetalhe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoProdutoDetalhe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoriaProdutoDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesoProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidadeMedidaProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoCompraProdutoDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoVendaProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoqueProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaDetalheProdutoLayout.setVerticalGroup(
            telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDetalheProdutoLayout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricanteProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(jLabel55)
                        .addComponent(txtPesoProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)
                        .addComponent(txtUnidadeMedidaProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCategoriaProdutoDetalhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(telaDetalheProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtPrecoCompraProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txtEstoqueProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVendaProdutoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("CADASTRAR FUNCIONARIO");

        jLabel32.setText("Nome");

        jLabel33.setText("Usuario");

        jLabel49.setText("Senha");

        comboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel63.setText("Perfil");

        jButton1.setText("Cancelar");

        btnSalvarUsuario.setText("Salvar");

        jLabel64.setText("Salario");

        jLabel69.setText("Telefone");

        jLabel70.setText("Endereço");

        jLabel71.setText("Celular");

        javax.swing.GroupLayout telaCadastrarUsuarioLayout = new javax.swing.GroupLayout(telaCadastrarUsuario.getContentPane());
        telaCadastrarUsuario.getContentPane().setLayout(telaCadastrarUsuarioLayout);
        telaCadastrarUsuarioLayout.setHorizontalGroup(
            telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
            .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                        .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsuarioCadastrarUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCadastrarUsuarioLayout.createSequentialGroup()
                                .addComponent(txtSenhaCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalarioCadastrarUsuario))
                            .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelularCadastrarUsuario))))
                    .addComponent(txtEndereçoCadastrarUsuario))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        telaCadastrarUsuarioLayout.setVerticalGroup(
            telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastrarUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtSalarioCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(txtTelefoneCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(18, 18, 18)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCelularCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71))
                    .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenhaCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49)
                        .addComponent(comboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63)))
                .addGap(18, 18, 18)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereçoCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(telaCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jLabel73.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("DETALHES FUNCIONARIO");

        txtNomeDetalheUsuario.setEditable(false);
        txtNomeDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNomeDetalheUsuario.setEnabled(false);

        txtUsuarioDetalheUsuario.setEditable(false);
        txtUsuarioDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuarioDetalheUsuario.setEnabled(false);

        txtSenhaDetalheUsuario.setEditable(false);
        txtSenhaDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSenhaDetalheUsuario.setEnabled(false);

        jLabel74.setText("Nome");

        jLabel75.setText("Usuario");

        jLabel76.setText("Senha");

        jLabel77.setText("Perfil");

        txtSalarioDetalheUsuario.setEditable(false);
        txtSalarioDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSalarioDetalheUsuario.setEnabled(false);

        jLabel78.setText("Salario");

        jLabel79.setText("Telefone");

        txtTelefoneDetalheUsuario.setEditable(false);
        txtTelefoneDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefoneDetalheUsuario.setEnabled(false);

        txtEndereçoDetalheUsuario.setEditable(false);
        txtEndereçoDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEndereçoDetalheUsuario.setEnabled(false);

        jLabel80.setText("Endereço");

        jLabel81.setText("Celular");

        txtCelularDetalheUsuario.setEditable(false);
        txtCelularDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCelularDetalheUsuario.setEnabled(false);

        txtPerfilDetalheUsuario.setEditable(false);
        txtPerfilDetalheUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPerfilDetalheUsuario.setEnabled(false);

        javax.swing.GroupLayout telaDetalhesUsuarioLayout = new javax.swing.GroupLayout(telaDetalhesUsuario.getContentPane());
        telaDetalhesUsuario.getContentPane().setLayout(telaDetalhesUsuarioLayout);
        telaDetalhesUsuarioLayout.setHorizontalGroup(
            telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                        .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsuarioDetalheUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaDetalhesUsuarioLayout.createSequentialGroup()
                                .addComponent(txtSenhaDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel77)
                                .addGap(7, 7, 7)
                                .addComponent(txtPerfilDetalheUsuario))
                            .addComponent(txtNomeDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalarioDetalheUsuario))
                            .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneDetalheUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelularDetalheUsuario))))
                    .addComponent(txtEndereçoDetalheUsuario))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        telaDetalhesUsuarioLayout.setVerticalGroup(
            telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDetalhesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(txtSalarioDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78)))
                .addGap(18, 18, 18)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(txtTelefoneDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addGap(18, 18, 18)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCelularDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81))
                    .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenhaDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel76)
                        .addComponent(jLabel77)
                        .addComponent(txtPerfilDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(telaDetalhesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereçoDetalheUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel82.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("EDITAR FUNCIONARIO");

        jLabel83.setText("Nome");

        jLabel84.setText("Usuario");

        jLabel85.setText("Senha");

        comboBoxPerfilEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel86.setText("Perfil");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSalvarUsuarioEditar.setText("Atualizar");

        jLabel87.setText("Salario");

        jLabel88.setText("Telefone");

        jLabel89.setText("Endereço");

        jLabel90.setText("Celular");

        jLabel91.setText("Id");

        javax.swing.GroupLayout telaEditarUsuarioLayout = new javax.swing.GroupLayout(telaEditarUsuario.getContentPane());
        telaEditarUsuario.getContentPane().setLayout(telaEditarUsuarioLayout);
        telaEditarUsuarioLayout.setHorizontalGroup(
            telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                        .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsuarioEditarUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaEditarUsuarioLayout.createSequentialGroup()
                                .addComponent(txtSenhaEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxPerfilEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalarioEditarUsuario))
                            .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelularEditarUsuario))))
                    .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(txtEndereçoEditarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        telaEditarUsuarioLayout.setVerticalGroup(
            telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEditarUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(txtSalarioEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87))
                .addGap(18, 18, 18)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(txtTelefoneEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addGap(18, 18, 18)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCelularEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel90))
                    .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenhaEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85)
                        .addComponent(comboBoxPerfilEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel86)))
                .addGap(18, 18, 18)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndereçoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel89))
                    .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(telaEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        painelEstatisticas.setPreferredSize(new java.awt.Dimension(1414, 817));

        panel2.setBackground(new java.awt.Color(255, 102, 0));
        panel2.setPreferredSize(new java.awt.Dimension(346, 202));
        panel2.setRoundBottomLeft(20);
        panel2.setRoundBottomRight(20);
        panel2.setRoundTopLeft(20);
        panel2.setRoundTopRight(20);

        btnNovoProduto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(255, 102, 0));
        btnNovoProduto.setText("Novo Produto");

        labelProdutos.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelProdutos.setText("0");

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Produtos");

        btnVerProduto.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        btnVerProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProduto.setText("Ver todos");
        btnVerProduto.setBorderPainted(false);
        btnVerProduto.setContentAreaFilled(false);
        btnVerProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(btnNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerProduto)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerProduto))
                .addGap(21, 21, 21))
        );

        panel3.setBackground(new java.awt.Color(0, 0, 255));
        panel3.setRoundBottomLeft(20);
        panel3.setRoundBottomRight(20);
        panel3.setRoundTopLeft(20);
        panel3.setRoundTopRight(20);

        jLabel62.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Vendas");

        labelVenda.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelVenda.setText("0");

        btnNovaVenda.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovaVenda.setForeground(new java.awt.Color(0, 0, 255));
        btnNovaVenda.setText("Nova Venda");
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });

        btnVerVenda.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        btnVerVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVerVenda.setText("Ver todos");
        btnVerVenda.setBorderPainted(false);
        btnVerVenda.setContentAreaFilled(false);
        btnVerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(btnNovaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerVenda))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerVenda))
                .addGap(21, 21, 21))
        );

        panel4.setBackground(new java.awt.Color(51, 255, 0));
        panel4.setRoundBottomLeft(20);
        panel4.setRoundBottomRight(20);
        panel4.setRoundTopLeft(20);
        panel4.setRoundTopRight(20);

        btnVerRelatorio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnVerRelatorio.setForeground(new java.awt.Color(0, 255, 0));
        btnVerRelatorio.setText("Relatorio");
        btnVerRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRelatorioActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelTotal.setText("0,00");

        jLabel66.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Lucro Total");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(btnVerRelatorio)
                        .addContainerGap())
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addGap(0, 400, Short.MAX_VALUE))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel72.setText("Usuario");

        panel5.setBackground(new java.awt.Color(255, 51, 102));
        panel5.setRoundBottomLeft(20);
        panel5.setRoundBottomRight(20);
        panel5.setRoundTopLeft(20);
        panel5.setRoundTopRight(20);

        jLabel92.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Funcionarios");

        btnVerFuncionario.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        btnVerFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnVerFuncionario.setText("Ver todos");
        btnVerFuncionario.setBorderPainted(false);
        btnVerFuncionario.setContentAreaFilled(false);
        btnVerFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFuncionarioActionPerformed(evt);
            }
        });

        btnNovoFuncionario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoFuncionario.setForeground(new java.awt.Color(255, 0, 102));
        btnNovoFuncionario.setText("Cadastrar");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        labelFuncionario.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelFuncionario.setText("0");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(btnNovoFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerFuncionario))
                    .addComponent(jLabel92))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerFuncionario))
                .addGap(28, 28, 28))
        );

        tabelaTop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tabelaTop10);

        jLabel93.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("10 PRODUTOS MAS VENDIDOS");

        javax.swing.GroupLayout painelEstatisticasLayout = new javax.swing.GroupLayout(painelEstatisticas);
        painelEstatisticas.setLayout(painelEstatisticasLayout);
        painelEstatisticasLayout.setHorizontalGroup(
            painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstatisticasLayout.createSequentialGroup()
                .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEstatisticasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEstatisticasLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEstatisticasLayout.createSequentialGroup()
                                .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane9)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(103, 103, 103)
                                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEstatisticasLayout.createSequentialGroup()
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        painelEstatisticasLayout.setVerticalGroup(
            painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstatisticasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelEstatisticasLayout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(painelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuarioLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPrincipal.add(painelEstatisticas, "card8");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR VENDA");

        tabelaRegistrarVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabelaRegistrarVenda);

        jLabel3.setText("Pesquisar Produto");

        jLabel4.setText("Produto");

        txtProdutoVenda.setToolTipText("produto");
        txtProdutoVenda.setName(""); // NOI18N

        jLabel6.setText("Quantidade");

        txtValorPagoVenda.setPreferredSize(new java.awt.Dimension(7, 30));

        jLabel7.setText("Valor Pago");

        comboBoxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Debito", "Credito a vista", "Credito parcelado", " " }));

        jLabel9.setText("Forma de pagamento");

        btnCancelarVenda.setText("Cancelar");
        btnCancelarVenda.setPreferredSize(new java.awt.Dimension(115, 45));
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnVenderVenda.setText("Vender");
        btnVenderVenda.setPreferredSize(new java.awt.Dimension(105, 45));

        panel1.setBackground(new java.awt.Color(0, 102, 255));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("TOTAL:");

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel25.setText("PAGO:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel10.setText("TROCO:");

        labelValorPago.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelValorPago.setText("0,00");

        labelTroco.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelTroco.setText("0,00");

        labelTotalVenda.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelTotalVenda.setText("0,00");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(labelTroco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(labelValorPago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelTotalVenda)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        txtEstoqueAtualVenda.setEditable(false);
        txtEstoqueAtualVenda.setPreferredSize(new java.awt.Dimension(7, 30));

        jLabel8.setText("Estoque atual");

        javax.swing.GroupLayout painelRegistrarVendaLayout = new javax.swing.GroupLayout(painelRegistrarVenda);
        painelRegistrarVenda.setLayout(painelRegistrarVendaLayout);
        painelRegistrarVendaLayout.setHorizontalGroup(
            painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRegistrarVendaLayout.createSequentialGroup()
                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addGap(650, 650, 650))
                            .addComponent(txtProdutoVenda)
                            .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(597, 597, 597))
                            .addComponent(txtPesquisarProdutoVenda)
                            .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29))
                                    .addComponent(spinnerQuantidadeVenda))
                                .addGap(18, 18, 18)
                                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorPagoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(134, 134, 134)))
                                .addGap(18, 18, 18)
                                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstoqueAtualVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(184, 184, 184))
                            .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(579, 579, 579))
                            .addComponent(comboBoxPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(btnVenderVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        painelRegistrarVendaLayout.setVerticalGroup(
            painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
                    .addGroup(painelRegistrarVendaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarProdutoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValorPagoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstoqueAtualVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(spinnerQuantidadeVenda))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelRegistrarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenderVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        painelPrincipal.add(painelRegistrarVenda, "card2");

        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setPreferredSize(new java.awt.Dimension(83, 45));
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LISTA DE PRODUTO");

        tabelaListaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tabelaListaProduto);

        btnDetalheProduto.setText("Detalhes");
        btnDetalheProduto.setPreferredSize(new java.awt.Dimension(83, 45));
        btnDetalheProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalheProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setText("Editar");
        btnEditarProduto.setPreferredSize(new java.awt.Dimension(83, 45));
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnAtualizarListaProduto.setText("Atualizar");
        btnAtualizarListaProduto.setPreferredSize(new java.awt.Dimension(83, 45));
        btnAtualizarListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarListaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelListaProdutoLayout = new javax.swing.GroupLayout(painelListaProduto);
        painelListaProduto.setLayout(painelListaProdutoLayout);
        painelListaProdutoLayout.setHorizontalGroup(
            painelListaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
            .addGroup(painelListaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelListaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListaProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1421, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListaProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtualizarListaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalheProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        painelListaProdutoLayout.setVerticalGroup(
            painelListaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaProdutoLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelListaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalheProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarListaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        painelPrincipal.add(painelListaProduto, "card3");

        btnExcluirVenda.setText("Excluir");
        btnExcluirVenda.setPreferredSize(new java.awt.Dimension(83, 45));
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("HISTORICO DE VENDAS");

        tabelaHistoricoVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUTO", "VALOR PAGO", "QUANTIDADE", "FORMA DE PAGAMENTO"
            }
        ));
        jScrollPane7.setViewportView(tabelaHistoricoVendas);

        javax.swing.GroupLayout painelHistoricoVendasLayout = new javax.swing.GroupLayout(painelHistoricoVendas);
        painelHistoricoVendas.setLayout(painelHistoricoVendasLayout);
        painelHistoricoVendasLayout.setHorizontalGroup(
            painelHistoricoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHistoricoVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(painelHistoricoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelHistoricoVendasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1421, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        painelHistoricoVendasLayout.setVerticalGroup(
            painelHistoricoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHistoricoVendasLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 711, Short.MAX_VALUE)
                .addComponent(btnExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(painelHistoricoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelHistoricoVendasLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGap(76, 76, 76)))
        );

        painelPrincipal.add(painelHistoricoVendas, "card3");

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CONTROLE DE ESTOQUE");

        jLabel5.setText("Pesquisar Produto");

        txtPesquisaProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoEstoqueActionPerformed(evt);
            }
        });

        txtProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoEstoqueActionPerformed(evt);
            }
        });

        jLabel30.setText("Produto");

        jLabel31.setText("Quantidade");

        tabelaControleEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "PRODUTO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaControleEstoque);

        btnAddEstoque.setText("Adicionar");
        btnAddEstoque.setPreferredSize(new java.awt.Dimension(119, 45));
        btnAddEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEstoqueActionPerformed(evt);
            }
        });

        btnCancelarEstoque.setText("Cancelar");
        btnCancelarEstoque.setPreferredSize(new java.awt.Dimension(115, 45));
        btnCancelarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEstoqueActionPerformed(evt);
            }
        });

        jLabel37.setText("Id");

        txtProdutoEstoqueID.setEditable(false);

        btnAtualizarControleEstoque.setText("Atualizar");
        btnAtualizarControleEstoque.setPreferredSize(new java.awt.Dimension(83, 45));
        btnAtualizarControleEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarControleEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelControleEstoqueLayout = new javax.swing.GroupLayout(painelControleEstoque);
        painelControleEstoque.setLayout(painelControleEstoqueLayout);
        painelControleEstoqueLayout.setHorizontalGroup(
            painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                        .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addGap(610, 610, 610))
                            .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(672, 672, 672))
                            .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProdutoEstoque)
                                    .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(510, 510, 510)))
                                .addGap(18, 18, 18)
                                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(125, 125, 125))
                                    .addComponent(txtProdutoEstoqueID)))
                            .addComponent(txtPesquisaProdutoEstoque)
                            .addGroup(painelControleEstoqueLayout.createSequentialGroup()
                                .addComponent(spinnerQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(678, 678, 678))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelControleEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizarControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        painelControleEstoqueLayout.setVerticalGroup(
            painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelControleEstoqueLayout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisaProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdutoEstoqueID))
                .addGap(18, 18, 18)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerQuantidadeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelControleEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        painelPrincipal.add(painelControleEstoque, "card7");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CADASTRAR PRODUTO");

        jLabel19.setText("Preço de Compra");

        jLabel22.setText("Estoque");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        jLabel16.setText("Categoria");

        jLabel14.setText("Fabricante");

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.setPreferredSize(new java.awt.Dimension(83, 45));

        txtFabricanteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteProdutoActionPerformed(evt);
            }
        });

        jLabel21.setText("Descrição");

        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });

        txtPrecoCompraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCompraProdutoActionPerformed(evt);
            }
        });

        jLabel17.setText("Peso");

        txtEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueProdutoActionPerformed(evt);
            }
        });

        txtPesoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoProdutoActionPerformed(evt);
            }
        });

        jLabel13.setText("Nome do Produto");

        btnCategoria.setContentAreaFilled(false);
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        txtUnidadeMedidaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeMedidaProdutoActionPerformed(evt);
            }
        });

        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.setPreferredSize(new java.awt.Dimension(79, 45));
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        txtPrecoVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaProdutoActionPerformed(evt);
            }
        });

        txtDescricaoProduto.setColumns(20);
        txtDescricaoProduto.setRows(5);
        jScrollPane3.setViewportView(txtDescricaoProduto);

        jLabel18.setText("Unidade de medida");

        ComboBoxCategoria.setEditable(true);

        jLabel15.setText("Codigo");

        jLabel20.setText("Preço de Venda");

        javax.swing.GroupLayout painelRegistrarProdutoLayout = new javax.swing.GroupLayout(painelRegistrarProduto);
        painelRegistrarProduto.setLayout(painelRegistrarProdutoLayout);
        painelRegistrarProdutoLayout.setHorizontalGroup(
            painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRegistrarProdutoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                        .addGap(47, 47, Short.MAX_VALUE)
                        .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelRegistrarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(745, 745, 745))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelRegistrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(197, 197, 197)))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(439, 439, 439))
                            .addComponent(txtNomeProduto))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(390, 390, 390))
                            .addComponent(txtFabricanteProduto)))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelRegistrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(333, 333, 333))
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(ComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesoProduto)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addGap(137, 137, 137)))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnidadeMedidaProduto)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(59, 59, 59)))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoCompraProduto)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addGap(108, 108, 108)))
                        .addGap(18, 18, 18)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoVendaProduto)
                            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(118, 118, 118)))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelRegistrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
        );
        painelRegistrarProdutoLayout.setVerticalGroup(
            painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtFabricanteProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidadeMedidaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtPrecoCompraProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(painelRegistrarProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGroup(painelRegistrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        painelPrincipal.add(painelRegistrarProduto, "card8");

        tabelaRealorioMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "VENDA", "LUCRO", "DATA"
            }
        ));
        jScrollPane11.setViewportView(tabelaRealorioMes);

        txtPesquisarPorDataMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarPorDataMesActionPerformed(evt);
            }
        });

        jLabel28.setText("Insira a data");

        jLabel68.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("RELATORIO");

        jLabel98.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel98.setText("Lucro Total Pesquisado:");

        labelLucroPesquisado.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarPorDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel98)
                .addGap(18, 18, 18)
                .addComponent(labelLucroPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarPorDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLucroPesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelRelatorio.addTab("Relatorio", jPanel4);

        painelPrincipal.add(painelRelatorio, "card9");

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1421, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuporte.addTab("Como registrar venda", jPanel3);

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1421, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuporte.addTab("Como Cadastrar produto", jPanel8);

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1421, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuporte.addTab("Como atualizar o estoque", jPanel9);

        painelPrincipal.add(painelSuporte, "card10");

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("GERENCIAMENTO DE FUNCIONARIO");

        btnCancelarUsuario.setText("Cancelar");
        btnCancelarUsuario.setPreferredSize(new java.awt.Dimension(83, 45));
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tabelaUsuarios);

        btnRegistrarUsuario.setText("Cadastrar");
        btnRegistrarUsuario.setPreferredSize(new java.awt.Dimension(83, 45));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnDeatlhesUsuario.setText("Detalhes");
        btnDeatlhesUsuario.setPreferredSize(new java.awt.Dimension(83, 45));

        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.setPreferredSize(new java.awt.Dimension(83, 45));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.setPreferredSize(new java.awt.Dimension(83, 45));
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 1445, Short.MAX_VALUE)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeatlhesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeatlhesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelPrincipal.add(painelUsuario, "card10");

        tabelaLogProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tabelaLogProduto);

        jLabel94.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("LOG PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelLog.addTab("Produto", jPanel1);

        tabelaLogVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tabelaLogVenda);

        jLabel95.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("LOG VENDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelLog.addTab("Venda", jPanel2);

        tabelaLogUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(tabelaLogUsuario);

        jLabel96.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("LOG USUARIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelLog.addTab("Usuario", jPanel5);

        tabelaLogCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(tabelaLogCategoria);

        jLabel97.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("LOG CATEGORIA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelLog.addTab("Categoria", jPanel6);

        painelPrincipal.add(painelLog, "card11");

        Menubar.setMinimumSize(new java.awt.Dimension(64, 30));
        Menubar.setPreferredSize(new java.awt.Dimension(500, 30));

        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Inicio2.setText("Inicio");
        Inicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio2ActionPerformed(evt);
            }
        });
        Inicio.add(Inicio2);

        Menubar.add(Inicio);

        Venda.setText("Venda");

        RegistrarVenda.setText("Registrar Venda");
        RegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVendaActionPerformed(evt);
            }
        });
        Venda.add(RegistrarVenda);

        HistoricoVendas.setText("Historico de Vendas");
        HistoricoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoVendasActionPerformed(evt);
            }
        });
        Venda.add(HistoricoVendas);

        RelatorioVendas.setText("Relatorio de Vendas");
        RelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioVendasActionPerformed(evt);
            }
        });
        Venda.add(RelatorioVendas);

        Menubar.add(Venda);

        Estoque.setText("Estoque");

        AdicionarProduto.setText("Adicionar Produto");
        Estoque.add(AdicionarProduto);

        ListaProduto.setText("Lista de Produtos");
        Estoque.add(ListaProduto);

        ControleEstoque.setText("Controle de Estoque");
        Estoque.add(ControleEstoque);

        Menubar.add(Estoque);

        jMenu1.setText("Funcionario");

        funcionario.setText("Gerenciar Funcionarios");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        jMenu1.add(funcionario);

        Menubar.add(jMenu1);

        Configurações.setText("Configurações");

        Tema.setText("Tema");

        ModoClaro.setText("Modo Claro");
        ModoClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoClaroActionPerformed(evt);
            }
        });
        Tema.add(ModoClaro);

        ModoEscuro.setText("Modo Escuro");
        ModoEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoEscuroActionPerformed(evt);
            }
        });
        Tema.add(ModoEscuro);

        Configurações.add(Tema);

        TrocarConta.setText("Trocar de Conta");
        TrocarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocarContaActionPerformed(evt);
            }
        });
        Configurações.add(TrocarConta);

        logs.setText("Logs");
        logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsActionPerformed(evt);
            }
        });
        Configurações.add(logs);

        Menubar.add(Configurações);

        Ajuda.setText("Ajuda");

        Suporte.setText("Suporte");
        Suporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuporteActionPerformed(evt);
            }
        });
        Ajuda.add(Suporte);

        Menubar.add(Ajuda);

        setJMenuBar(Menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatorioVendasActionPerformed

    private void RegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarVendaActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnDetalheProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalheProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetalheProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void HistoricoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistoricoVendasActionPerformed

    private void ModoClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoClaroActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacLightLaf());
                updateUIRecursively(painelPrincipal);
                updateUIRecursively(painelRegistrarVenda);
                updateUIRecursively(painelListaProduto);
                updateUIRecursively(painelHistoricoVendas);
                updateUIRecursively(painelControleEstoque);
                updateUIRecursively(painelRegistrarProduto);
                updateUIRecursively(painelEstatisticas);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_ModoClaroActionPerformed

    private void ModoEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoEscuroActionPerformed
         SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
                updateUIRecursively(painelPrincipal);
                updateUIRecursively(painelRegistrarVenda);
                updateUIRecursively(painelListaProduto);
                updateUIRecursively(painelHistoricoVendas);
                updateUIRecursively(painelControleEstoque);
                updateUIRecursively(painelRegistrarProduto);
                updateUIRecursively(painelEstatisticas);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_ModoEscuroActionPerformed

    private void txtUnidadeMedidaProdutoDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaProdutoDetalheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeMedidaProdutoDetalheActionPerformed

    private void txtPrecoCompraProdutoDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCompraProdutoDetalheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCompraProdutoDetalheActionPerformed

    private void txtPrecoVendaProdutoDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoDetalheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaProdutoDetalheActionPerformed

    private void txtPesoProdutoDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoProdutoDetalheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoProdutoDetalheActionPerformed

    private void txtEstoqueProdutoDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueProdutoDetalheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueProdutoDetalheActionPerformed

    private void txtPesquisaProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaProdutoEstoqueActionPerformed

    private void txtProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoEstoqueActionPerformed

    private void btnAddEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEstoqueActionPerformed

    private void txtIdProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoEditarActionPerformed

    private void btnSalvarProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarProdutoEditarActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        getTelaEditarProduto().setVisible(false);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void txtPrecoVendaProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaProdutoEditarActionPerformed

    private void txtPrecoCompraProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCompraProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCompraProdutoEditarActionPerformed

    private void txtUnidadeMedidaProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeMedidaProdutoEditarActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnVerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRelatorioActionPerformed
        painelComponentes(this.getPainelRelatorio());
    }//GEN-LAST:event_btnVerRelatorioActionPerformed

    private void SuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuporteActionPerformed

    private void txtPrecoVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed

    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void txtUnidadeMedidaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeMedidaProdutoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        telaCategoria.setLocationRelativeTo(null);
        telaCategoria.setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void txtPesoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoProdutoActionPerformed

    private void txtEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueProdutoActionPerformed

    private void txtPrecoCompraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCompraProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCompraProdutoActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void txtFabricanteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnVerProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProdutoActionPerformed
        painelComponentes(this.getPainelListaProduto());
    }//GEN-LAST:event_btnVerProdutoActionPerformed

    private void btnVerVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVendaActionPerformed
        painelComponentes(this.getPainelHistoricoVendas());
    }//GEN-LAST:event_btnVerVendaActionPerformed

    private void btnAtualizarListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarListaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarListaProdutoActionPerformed

    private void btnAtualizarControleEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarControleEstoqueActionPerformed
        
    }//GEN-LAST:event_btnAtualizarControleEstoqueActionPerformed

    private void btnCancelarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEstoqueActionPerformed
        painelComponentes(this.getPainelEstatisticas());
    }//GEN-LAST:event_btnCancelarEstoqueActionPerformed

    private void txtPesquisarPorDataMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarPorDataMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarPorDataMesActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        
    }//GEN-LAST:event_InicioActionPerformed

    private void Inicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio2ActionPerformed
        painelComponentes(this.getPainelEstatisticas());
    }//GEN-LAST:event_Inicio2ActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        this.getTelaCadastrarUsuario().pack();
        this.getTelaCadastrarUsuario().setLocationRelativeTo(null);
        this.getTelaCadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionarioActionPerformed

    private void TrocarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrocarContaActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        painelComponentes(this.getPainelEstatisticas());
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getTelaEditarProduto().setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnVerFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFuncionarioActionPerformed
        painelComponentes(getPainelUsuario());
    }//GEN-LAST:event_btnVerFuncionarioActionPerformed

    private void logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logsActionPerformed

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdicionarProduto;
    private javax.swing.JMenu Ajuda;
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JMenu Configurações;
    private javax.swing.JMenuItem ControleEstoque;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenuItem HistoricoVendas;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuItem Inicio2;
    private javax.swing.JMenuItem ListaProduto;
    private javax.swing.JMenuBar Menubar;
    private javax.swing.JMenuItem ModoClaro;
    private javax.swing.JMenuItem ModoEscuro;
    private javax.swing.JMenuItem RegistrarVenda;
    private javax.swing.JMenuItem RelatorioVendas;
    private javax.swing.JMenuItem Suporte;
    private javax.swing.JMenu Tema;
    private javax.swing.JMenuItem TrocarConta;
    private javax.swing.JMenu Venda;
    private javax.swing.JButton btnAddEstoque;
    private javax.swing.JButton btnAtualizarControleEstoque;
    private javax.swing.JButton btnAtualizarListaProduto;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCancelarCategoria;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnCancelarEstoque;
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnDeatlhesUsuario;
    private javax.swing.JButton btnDetalheProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnNovaVenda;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnSalvarCategoria;
    private javax.swing.JButton btnSalvarProdutoEditar;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JButton btnSalvarUsuarioEditar;
    private javax.swing.JButton btnVenderVenda;
    private javax.swing.JButton btnVerFuncionario;
    private javax.swing.JButton btnVerProduto;
    private javax.swing.JButton btnVerRelatorio;
    private javax.swing.JButton btnVerVenda;
    private javax.swing.JComboBox<String> comboBoxCategoriaEditar;
    private javax.swing.JComboBox<String> comboBoxPagamento;
    private javax.swing.JComboBox<String> comboBoxPerfil;
    private javax.swing.JComboBox<String> comboBoxPerfilEditar;
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelLucroPesquisado;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalVenda;
    private javax.swing.JLabel labelTroco;
    private javax.swing.JLabel labelUsuarioLogado;
    private javax.swing.JLabel labelValorPago;
    private javax.swing.JLabel labelVenda;
    private javax.swing.JMenuItem logs;
    private javax.swing.JPanel painelControleEstoque;
    private javax.swing.JPanel painelEstatisticas;
    private javax.swing.JPanel painelHistoricoVendas;
    private javax.swing.JPanel painelListaProduto;
    private javax.swing.JTabbedPane painelLog;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelRegistrarProduto;
    private javax.swing.JPanel painelRegistrarVenda;
    private javax.swing.JTabbedPane painelRelatorio;
    private javax.swing.JTabbedPane painelSuporte;
    private javax.swing.JPanel painelUsuario;
    private view.Panel panel1;
    private view.Panel panel2;
    private view.Panel panel3;
    private view.Panel panel4;
    private view.Panel panel5;
    private javax.swing.JSpinner spinnerQuantidadeEstoque;
    private javax.swing.JSpinner spinnerQuantidadeVenda;
    private javax.swing.JTable tabelaControleEstoque;
    private javax.swing.JTable tabelaHistoricoVendas;
    private javax.swing.JTable tabelaListaProduto;
    private javax.swing.JTable tabelaLogCategoria;
    private javax.swing.JTable tabelaLogProduto;
    private javax.swing.JTable tabelaLogUsuario;
    private javax.swing.JTable tabelaLogVenda;
    private javax.swing.JTable tabelaRealorioMes;
    private javax.swing.JTable tabelaRegistrarVenda;
    private javax.swing.JTable tabelaTop10;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JDialog telaCadastrarUsuario;
    private javax.swing.JDialog telaCategoria;
    private javax.swing.JDialog telaDetalheProduto;
    private javax.swing.JDialog telaDetalhesUsuario;
    private javax.swing.JDialog telaEditarProduto;
    private javax.swing.JDialog telaEditarUsuario;
    private javax.swing.JTextField txtCategoriaProdutoDetalhe;
    private javax.swing.JTextField txtCelularCadastrarUsuario;
    private javax.swing.JTextField txtCelularDetalheUsuario;
    private javax.swing.JTextField txtCelularEditarUsuario;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtCodigoProdutoDetalhe;
    private javax.swing.JTextField txtCodigoProdutoEditar;
    private javax.swing.JTextArea txtDescricaoProduto;
    private javax.swing.JTextArea txtDescricaoProdutoDetalhe;
    private javax.swing.JTextArea txtDescricaoProdutoEditar;
    private javax.swing.JTextField txtEndereçoCadastrarUsuario;
    private javax.swing.JTextField txtEndereçoDetalheUsuario;
    private javax.swing.JTextField txtEndereçoEditarUsuario;
    private javax.swing.JTextField txtEstoqueAtualVenda;
    private javax.swing.JTextField txtEstoqueProduto;
    private javax.swing.JTextField txtEstoqueProdutoDetalhe;
    private javax.swing.JTextField txtFabricanteProduto;
    private javax.swing.JTextField txtFabricanteProdutoDetalhe;
    private javax.swing.JTextField txtFabricanteProdutoEditar;
    private javax.swing.JTextField txtIdEditarUsuario;
    private javax.swing.JTextField txtIdProdutoEditar;
    private javax.swing.JTextField txtNomeCadastrarUsuario;
    private javax.swing.JTextField txtNomeCategoria;
    private javax.swing.JTextField txtNomeDetalheUsuario;
    private javax.swing.JTextField txtNomeEditarUsuario;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNomeProdutoDetalhe;
    private javax.swing.JTextField txtNomeProdutoEditar;
    private javax.swing.JTextField txtPerfilDetalheUsuario;
    private javax.swing.JTextField txtPesoProduto;
    private javax.swing.JTextField txtPesoProdutoDetalhe;
    private javax.swing.JTextField txtPesoProdutoEditar;
    private javax.swing.JTextField txtPesquisaProdutoEstoque;
    private javax.swing.JTextField txtPesquisarPorDataMes;
    private javax.swing.JTextField txtPesquisarProdutoVenda;
    private javax.swing.JTextField txtPrecoCompraProduto;
    private javax.swing.JTextField txtPrecoCompraProdutoDetalhe;
    private javax.swing.JTextField txtPrecoCompraProdutoEditar;
    private javax.swing.JTextField txtPrecoVendaProduto;
    private javax.swing.JTextField txtPrecoVendaProdutoDetalhe;
    private javax.swing.JTextField txtPrecoVendaProdutoEditar;
    private javax.swing.JTextField txtProdutoEstoque;
    private javax.swing.JTextField txtProdutoEstoqueID;
    private javax.swing.JTextField txtProdutoVenda;
    private javax.swing.JTextField txtSalarioCadastrarUsuario;
    private javax.swing.JTextField txtSalarioDetalheUsuario;
    private javax.swing.JTextField txtSalarioEditarUsuario;
    private javax.swing.JTextField txtSenhaCadastrarUsuario;
    private javax.swing.JTextField txtSenhaDetalheUsuario;
    private javax.swing.JTextField txtSenhaEditarUsuario;
    private javax.swing.JTextField txtTelefoneCadastrarUsuario;
    private javax.swing.JTextField txtTelefoneDetalheUsuario;
    private javax.swing.JTextField txtTelefoneEditarUsuario;
    private javax.swing.JTextField txtUnidadeMedidaProduto;
    private javax.swing.JTextField txtUnidadeMedidaProdutoDetalhe;
    private javax.swing.JTextField txtUnidadeMedidaProdutoEditar;
    private javax.swing.JTextField txtUsuarioCadastrarUsuario;
    private javax.swing.JTextField txtUsuarioDetalheUsuario;
    private javax.swing.JTextField txtUsuarioEditarUsuario;
    private javax.swing.JTextField txtValorPagoVenda;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getAdicionarProduto() {
        return AdicionarProduto;
    }

    public JMenuItem getControleEstoque() {
        return ControleEstoque;
    }

    public JMenu getEstoque() {
        return Estoque;
    }

    public JMenuItem getHistoricoVendas() {
        return HistoricoVendas;
    }

    public JMenuItem getListaProduto() {
        return ListaProduto;
    }

    public JMenuItem getRegistrarVenda() {
        return RegistrarVenda;
    }

    public JMenuItem getRelatorioVendas() {
        return RelatorioVendas;
    }

    public JMenu getVenda() {
        return Venda;
    }

    public JMenu getjMenu2() {
        return Configurações;
    }

    public JMenuBar getjMenuBar2() {
        return Menubar;
    }

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public JPanel getPainelRegistrarVenda() {
        return painelRegistrarVenda;
    }

    public JMenu getAjuda() {
        return Ajuda;
    }

    public JPanel getPainelHistoricoVendas() {
        return painelHistoricoVendas;
    }

    public JPanel getPainelListaProduto() {
        return painelListaProduto;
    }

    public JPanel getPainelRegistrarProduto() {
        return painelRegistrarProduto;
    }

    public JPanel getPainelControleEstoque() {
        return painelControleEstoque;
    }

    public JButton getBtnCancelarCategoria() {
        return btnCancelarCategoria;
    }

    public JButton getBtnSalvarCategoria() {
        return btnSalvarCategoria;
    }

    public JDialog getTelaCategoria() {
        return telaCategoria;
    }

    public JTextField getTxtNomeCategoria() {
        return txtNomeCategoria;
    }

    public JButton getBtnCategoria() {
        return btnCategoria;
    }

    public JComboBox<String> getComboBoxCategoria() {
        return ComboBoxCategoria;
    }

    public JTextField getTxtCodigoProduto() {
        return txtCodigoProduto;
    }

    public JTextArea getTxtDescricaoProduto() {
        return txtDescricaoProduto;
    }

    public JTextField getTxtEstoqueProduto() {
        return txtEstoqueProduto;
    }

    public JTextField getTxtFabricanteProduto() {
        return txtFabricanteProduto;
    }

    public JTextField getTxtNomeProduto() {
        return txtNomeProduto;
    }

    public JTextField getTxtPesoProduto() {
        return txtPesoProduto;
    }

    public JTextField getTxtPrecoCompraProduto() {
        return txtPrecoCompraProduto;
    }

    public JTextField getTxtPrecoVendaProduto() {
        return txtPrecoVendaProduto;
    }

    public JTextField getTxtUnidadeMedidaProduto() {
        return txtUnidadeMedidaProduto;
    }

    public JTable getTabelaListaProduto() {
        return tabelaListaProduto;
    }

    public JTextField getTxtIdProdutoEditar() {
        return txtIdProdutoEditar;
    }
    
    public JComboBox<String> getComboBoxCategoriaEditar() {
        return comboBoxCategoriaEditar;
    }

    public JDialog getTelaEditarProduto() {
        return telaEditarProduto;
    }

    public JTextField getTxtCodigoProdutoEditar() {
        return txtCodigoProdutoEditar;
    }

    public JTextArea getTxtDescricaoProdutoEditar() {
        return txtDescricaoProdutoEditar;
    }

    public JTextField getTxtFabricanteProdutoEditar() {
        return txtFabricanteProdutoEditar;
    }

    public JTextField getTxtNomeProdutoEditar() {
        return txtNomeProdutoEditar;
    }

    public JTextField getTxtPesoProdutoEditar() {
        return txtPesoProdutoEditar;
    }

    public JTextField getTxtPrecoCompraProdutoEditar() {
        return txtPrecoCompraProdutoEditar;
    }

    public JTextField getTxtPrecoVendaProdutoEditar() {
        return txtPrecoVendaProdutoEditar;
    }

    public JTextField getTxtUnidadeMedidaProdutoEditar() {
        return txtUnidadeMedidaProdutoEditar;
    }

    public JButton getBtnEditarProduto() {
        return btnEditarProduto;
    }

    public JTextField getTxtCategoriaProdutoDetalhe() {
        return txtCategoriaProdutoDetalhe;
    }

    public JDialog getTelaDetalheProduto() {
        return telaDetalheProduto;
    }

    public JTextField getTxtCodigoProdutoDetalhe() {
        return txtCodigoProdutoDetalhe;
    }

    public JTextArea getTxtDescricaoProdutoDetalhe() {
        return txtDescricaoProdutoDetalhe;
    }
    
    public JTextField getTxtEstoqueProdutoDetalhe(){
        return txtEstoqueProdutoDetalhe;
    }

    public JTextField getTxtFabricanteProdutoDetalhe() {
        return txtFabricanteProdutoDetalhe;
    }

    public JTextField getTxtNomeProdutoDetalhe() {
        return txtNomeProdutoDetalhe;
    }

    public JTextField getTxtPesoProdutoDetalhe() {
        return txtPesoProdutoDetalhe;
    }

    public JTextField getTxtPrecoCompraProdutoDetalhe() {
        return txtPrecoCompraProdutoDetalhe;
    }

    public JTextField getTxtPrecoVendaProdutoDetalhe() {
        return txtPrecoVendaProdutoDetalhe;
    }

    public JTextField getTxtUnidadeMedidaProdutoDetalhe() {
        return txtUnidadeMedidaProdutoDetalhe;
    }

    public JSpinner getSpinnerQuantidadeEstoque() {
        return spinnerQuantidadeEstoque;
    }

    public JTable getTabelaControleEstoque() {
        return tabelaControleEstoque;
    }

    public JTable getTabelaRegistrarVenda() {
        return tabelaRegistrarVenda;
    }

    public JTextField getTxtPesquisaProdutoEstoque() {
        return txtPesquisaProdutoEstoque;
    }

    public JTextField getTxtProdutoEstoque() {
        return txtProdutoEstoque;
    }

    public JTextField getTxtPesquisarProdutoVenda() {
        return txtPesquisarProdutoVenda;
    }

    public JSpinner getSpinnerQuantidadeVenda() {
        return spinnerQuantidadeVenda;
    }

    public JTable getTabelaHistoricoVendas() {
        return tabelaHistoricoVendas;
    }

    public JTextField getTxtProdutoVenda() {
        return txtProdutoVenda;
    }

    public JTextField getTxtValorPagoVenda() {
        return txtValorPagoVenda;
    }

    public JComboBox<String> getComboBoxPagamento() {
        return comboBoxPagamento;
    }

    public JLabel getLabelTotalVenda() {
        return labelTotalVenda;
    }

    public JLabel getLabelTroco() {
        return labelTroco;
    }

    public JLabel getLabelValorPago() {
        return labelValorPago;
    }

    public JTextField getTxtProdutoEstoqueID() {
        return txtProdutoEstoqueID;
    }

    public JPanel getPainelEstatisticas() {
        return painelEstatisticas;
    }

    public JLabel getLabelProdutos() {
        return labelProdutos;
    }

    public JLabel getLabelTotal() {
        return labelTotal;
    }

    public JLabel getLabelVenda() {
        return labelVenda;
    }

    public JTabbedPane getPainelRelatorio() {
        return painelRelatorio;
    }

    public JTabbedPane getPainelSuporte() {
        return painelSuporte;
    }

    public JTable getTabelaRealorioMes() {
        return tabelaRealorioMes;
    }

    public JTextField getTxtPesquisarPorDataMes() {
        return txtPesquisarPorDataMes;
    }

    public JTextField getTxtEstoqueAtualVenda() {
        return txtEstoqueAtualVenda;
    }

    public JComboBox<String> getComboBoxPerfil() {
        return comboBoxPerfil;
    }

    public JDialog getTelaCadastrarUsuario() {
        return telaCadastrarUsuario;
    }

    public JTextField getTxtCelularCadastrarUsuario() {
        return txtCelularCadastrarUsuario;
    }

    public JTextField getTxtEndereçoCadastrarUsuario() {
        return txtEndereçoCadastrarUsuario;
    }

    public JTextField getTxtNomeCadastrarUsuario() {
        return txtNomeCadastrarUsuario;
    }

    public JTextField getTxtSalarioCadastrarUsuario() {
        return txtSalarioCadastrarUsuario;
    }

    public JTextField getTxtSenhaCadastrarUsuario() {
        return txtSenhaCadastrarUsuario;
    }

    public JTextField getTxtTelefoneCadastrarUsuario() {
        return txtTelefoneCadastrarUsuario;
    }

    public JTextField getTxtUsuarioCadastrarUsuario() {
        return txtUsuarioCadastrarUsuario;
    }

    public JTable getTabelaUsuarios() {
        return tabelaUsuarios;
    }

    public JPanel getPainelUsuario() {
        return painelUsuario;
    }

    public JLabel getLabelUsuarioLogado() {
        return labelUsuarioLogado;
    }

    public JTextField getTxtCelularDetalheUsuario() {
        return txtCelularDetalheUsuario;
    }

    public JTextField getTxtEndereçoDetalheUsuario() {
        return txtEndereçoDetalheUsuario;
    }

    public JTextField getTxtNomeDetalheUsuario() {
        return txtNomeDetalheUsuario;
    }

    public JTextField getTxtSalarioDetalheUsuario() {
        return txtSalarioDetalheUsuario;
    }

    public JTextField getTxtSenhaDetalheUsuario() {
        return txtSenhaDetalheUsuario;
    }

    public JTextField getTxtTelefoneDetalheUsuario() {
        return txtTelefoneDetalheUsuario;
    }

    public JTextField getTxtUsuarioDetalheUsuario() {
        return txtUsuarioDetalheUsuario;
    }

    public JTextField getTxtPerfilDetalheUsuario() {
        return txtPerfilDetalheUsuario;
    }

    public JDialog getTelaDetalhesUsuario() {
        return telaDetalhesUsuario;
    }

    public JComboBox<String> getComboBoxPerfilEditar() {
        return comboBoxPerfilEditar;
    }

    public JDialog getTelaEditarUsuario() {
        return telaEditarUsuario;
    }

    public JTextField getTxtCelularEditarUsuario() {
        return txtCelularEditarUsuario;
    }

    public JTextField getTxtEndereçoEditarUsuario() {
        return txtEndereçoEditarUsuario;
    }

    public JTextField getTxtNomeEditarUsuario() {
        return txtNomeEditarUsuario;
    }

    public JTextField getTxtSalarioEditarUsuario() {
        return txtSalarioEditarUsuario;
    }

    public JTextField getTxtSenhaEditarUsuario() {
        return txtSenhaEditarUsuario;
    }

    public JTextField getTxtTelefoneEditarUsuario() {
        return txtTelefoneEditarUsuario;
    }

    public JTextField getTxtUsuarioEditarUsuario() {
        return txtUsuarioEditarUsuario;
    }

    public JTextField getTxtIdEditarUsuario() {
        return txtIdEditarUsuario;
    }

    public JLabel getLabelFuncionario() {
        return labelFuncionario;
    }

    public JTable getTabelaTop10() {
        return tabelaTop10;
    }

    public JTable getTabelaLogProduto() {
        return tabelaLogProduto;
    }

    public JTable getTabelaLogCategoria() {
        return tabelaLogCategoria;
    }

    public JTable getTabelaLogUsuario() {
        return tabelaLogUsuario;
    }

    public JTable getTabelaLogVenda() {
        return tabelaLogVenda;
    }

    public JTabbedPane getPainelLog() {
        return painelLog;
    }

    public JLabel getLabelLucroPesquisado() {
        return labelLucroPesquisado;
    }
    
    private void painelComponentes(JPanel panel){
        this.getPainelPrincipal().removeAll();
        this.getPainelPrincipal().repaint();
        this.getPainelPrincipal().revalidate();
        this.getPainelPrincipal().add(panel);
        this.getPainelPrincipal().repaint();
        this.getPainelPrincipal().revalidate();
    }
    
    private void painelComponentes(JTabbedPane panel){
        this.getPainelPrincipal().removeAll();
        this.getPainelPrincipal().repaint();
        this.getPainelPrincipal().revalidate();
        this.getPainelPrincipal().add(panel);
        this.getPainelPrincipal().repaint();
        this.getPainelPrincipal().revalidate();
    }

    private void updateUIRecursively(Component comp) {
        if (comp == null) return;
    
        SwingUtilities.updateComponentTreeUI(comp);
    
        if (comp instanceof JComponent) {
            ((JComponent) comp).revalidate();
            ((JComponent) comp).repaint();
        }

        if (comp instanceof Container) {
            Component[] children = ((Container) comp).getComponents();
            for (Component child : children) {
                updateUIRecursively(child);
            }
        }
    }
    
}
