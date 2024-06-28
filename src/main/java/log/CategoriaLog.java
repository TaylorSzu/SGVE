package log;

import java.time.LocalDateTime;

public class CategoriaLog {
    private long id;
    private String acao;
    private String categoria;
    private LocalDateTime dataRegistro;

    public CategoriaLog(String acao, String categoria, LocalDateTime dataRegistro) {
        this.id = id;
        this.acao = acao;
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

