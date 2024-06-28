package entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Venda {
    private Long id;
    private String produto;
    private int quantidade;
    private BigDecimal valorPago;
    private String pagamento;
    private Date data;

    public Venda(String produto, int quantidade, BigDecimal valorPago, String pagamento, Date data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorPago = valorPago;
        this.pagamento = pagamento;
        this.data = data;
    }

    public Venda(String produto, int quantidade, BigDecimal valorPago, String pagamento) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorPago = valorPago;
        this.pagamento = pagamento;
        this.data = data;
    }

    public Venda(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
