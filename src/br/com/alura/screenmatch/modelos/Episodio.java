package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacoes;

    public Episodio(int numero, String nome, Serie serie) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
