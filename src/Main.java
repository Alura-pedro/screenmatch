import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm;
        filmeUm = new Filme();

        filmeUm.setNome("Carros");
        filmeUm.setAnoDeLancamento(2008);
        filmeUm.setCategoria("Animação");
        filmeUm.setTempoDeDuracao(105);
        filmeUm.setIncluidoNoPlano(true);

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(9);
        filmeUm.avalia(6);
        filmeUm.avalia(7);

        System.out.println();
        System.out.println(filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.pegaMedia());
    }
}
