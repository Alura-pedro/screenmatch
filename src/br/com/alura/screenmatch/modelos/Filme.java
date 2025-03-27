package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, String categoria, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos, String diretor) {
        super(nome, categoria, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
        this.diretor = diretor;
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getTotalDeAvaliacoes() {
        return super.getTotalDeAvaliacoes();
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
