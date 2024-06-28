package log;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VendaLog{ 
    private long id;
    private String acao;
    private String produto;
    private int quantidade;
    private BigDecimal valorPago;
    private String pagamento;
    private LocalDateTime dataVenda;
    private LocalDateTime dataRegistro;

    public VendaLog(String acao, String produto, int quantidade, BigDecimal valorPago, String pagamento1, LocalDateTime dataVenda) {
        this.id = id;
        this.acao = acao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorPago = valorPago;
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
        this.dataRegistro = dataRegistro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
