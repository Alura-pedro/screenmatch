package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private String categoria;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int tempoDeDuracao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public void exibeFichaTecnica(){
        System.out.printf("Nome do Filme: %s", nome);
        System.out.printf("\nAno de lançamento: %d", anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
