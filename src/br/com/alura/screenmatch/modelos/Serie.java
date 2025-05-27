package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, String categoria, int anoDeLancamento, boolean incluidoNoPlano, boolean ativa, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nome, categoria, anoDeLancamento, incluidoNoPlano);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.ativa = ativa;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return minutosPorEpisodio * temporadas * episodiosPorTemporada;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
