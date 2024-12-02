public class Filme {
    String nome;
    String categoria;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int tempoDeDuracao;

    void exibeFichaTecnica(){
        System.out.printf("Nome do Filme: %s", nome);
        System.out.printf("\nAno de lançamento: %d", anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
