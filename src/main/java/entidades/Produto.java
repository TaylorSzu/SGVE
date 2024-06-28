package entidades;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private Long Codigo;
    private String Nome;
    private String Fabricante;
    private String Categoria;
    private BigDecimal Peso;
    private String UnidadeMedida;
    private BigDecimal PrecoCompra;
    private BigDecimal PrecoVenda;
    private int Estoque;
    private String Descricao;

    public Produto(Long Codigo, String Nome, String Fabricante, String Categoria, BigDecimal Peso, String UnidadeMedida, BigDecimal PrecoCompra, BigDecimal PrecoVenda, int Estoque, String Descricao) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Fabricante = Fabricante;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.UnidadeMedida = UnidadeMedida;
        this.PrecoCompra = PrecoCompra;
        this.PrecoVenda = PrecoVenda;
        this.Estoque = Estoque;

        this.Descricao = Descricao;
    }
    
    public Produto(Long Codigo, String Nome, String Fabricante, String Categoria, BigDecimal Peso, String UnidadeMedida, BigDecimal PrecoCompra, BigDecimal PrecoVenda, String Descricao) {
        this.id = id;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Fabricante = Fabricante;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.UnidadeMedida = UnidadeMedida;
        this.PrecoCompra = PrecoCompra;
        this.PrecoVenda = PrecoVenda;
        this.Estoque = Estoque;
        this.Descricao = Descricao;
    }

    public Produto(Long id, Long Codigo, String Nome, String Fabricante, String Categoria, BigDecimal Peso, String UnidadeMedida, BigDecimal PrecoCompra, BigDecimal PrecoVenda, int Estoque, String Descricao) {
        this.id = id;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Fabricante = Fabricante;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.UnidadeMedida = UnidadeMedida;
        this.PrecoCompra = PrecoCompra;
        this.PrecoVenda = PrecoVenda;
        this.Estoque = Estoque;
        this.Descricao = Descricao;
    }
    
    public Produto(Long id, Long Codigo, String Nome, String Fabricante, String Categoria, BigDecimal Peso, String UnidadeMedida, BigDecimal PrecoCompra, BigDecimal PrecoVenda, String Descricao) {
        this.id = id;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Fabricante = Fabricante;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.UnidadeMedida = UnidadeMedida;
        this.PrecoCompra = PrecoCompra;
        this.PrecoVenda = PrecoVenda;
        this.Estoque = Estoque;
        this.Descricao = Descricao;
    }

    public Produto() {
        this.id = id;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Fabricante = Fabricante;
        this.Categoria = Categoria;
        this.Peso = Peso;
        this.UnidadeMedida = UnidadeMedida;
        this.PrecoCompra = PrecoCompra;
        this.PrecoVenda = PrecoVenda;
        this.Estoque = Estoque;
        this.Descricao = Descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(Long Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public BigDecimal getPeso() {
        return Peso;
    }

    public void setPeso(BigDecimal Peso) {
        this.Peso = Peso;
    }

    public String getUnidadeMedida() {
        return UnidadeMedida;
    }

    public void setUnidadeMedida(String UnidadeMedida) {
        this.UnidadeMedida = UnidadeMedida;
    }

    public BigDecimal getPrecoCompra() {
        return PrecoCompra;
    }

    public void setPrecoCompra(BigDecimal PrecoCompra) {
        this.PrecoCompra = PrecoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(BigDecimal PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
}
