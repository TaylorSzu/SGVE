package log;

import java.time.LocalDateTime;

public class UsuarioLog {
    private long id;
    private String acao;
    private String nome;
    private String usuario;
    private String perfil;
    private LocalDateTime dataRegistro;

    public UsuarioLog(String acao, String nome, String usuario, String perfil, LocalDateTime dataRegistro) {
        this.id = id;
        this.acao = acao;
        this.nome = nome;
        this.usuario = usuario;
        this.perfil = perfil;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
