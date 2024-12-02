public class Main {
    public static void main(String[] args) {
        Filme filmeUm;
        filmeUm = new Filme();

        filmeUm.nome = "Carros";
        filmeUm.anoDeLancamento = 2008;
        filmeUm.categoria = "Animação";
        filmeUm.tempoDeDuracao = 105;
        filmeUm.incluidoNoPlano = true;

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(9);
        filmeUm.avalia(6);
        filmeUm.avalia(7);

        System.out.println(filmeUm.totalDeAvaliacoes);
        System.out.println(filmeUm.somaDasAvaliacoes);
        System.out.println(filmeUm.pegaMedia());
    }
}
