package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host = "";
    private String descricao = "";

    public Podcast(String titulo, int duracao, String host, String descricao) {
        super(titulo, duracao);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
