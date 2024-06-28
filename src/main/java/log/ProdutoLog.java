package log;

import java.time.LocalDateTime;

public class ProdutoLog {
    private long id;
    private String acao;
    private int codigo;
    private String nome;
    private String fabricante;
    private int estoque;
    private String categoria;
    private LocalDateTime dataRegistro;

    public ProdutoLog(String acao, int codigo, String nome, String fabricante, int estoque, String categoria, LocalDateTime dataRegistro) {
        this.id = id;
        this.acao = acao;
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.estoque = estoque;
        this.categoria = categoria;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    
}

