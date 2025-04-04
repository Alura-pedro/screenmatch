package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo = "";
    private int duracao = 0;
    private int totalReproducao = 0;
    private int totalCurtidas = 0;
    private int classificao = 0;

    public Audio(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
        totalReproducao = 0;
        totalCurtidas = 0;
        classificao = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void curtir() {
        totalCurtidas++;
    }

    public void reproduzir() {
        totalReproducao++;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificao() {
        return classificao;
    }


}

