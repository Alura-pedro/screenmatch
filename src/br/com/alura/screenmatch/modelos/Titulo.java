package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String categoria;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, String categoria, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.categoria = categoria;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = 0;
        this.totalDeAvaliacoes = 0;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.duracaoEmMinutos = tempoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.printf("Nome do Filme: %s", nome);
        System.out.printf("\nAno de lançamento: %d", anoDeLancamento);
        System.out.printf("\nCategoria: %s", categoria);
        System.out.printf("\nIncluido no plano: %s", ((incluidoNoPlano) ? "Sim" : "Não"));
        System.out.printf("\nDuração em minutos: %d min", duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double pegaMedia(){
        if (totalDeAvaliacoes == 0) {
        return 0.0; }

        return somaDasAvaliacoes / totalDeAvaliacoes;

    }
}
