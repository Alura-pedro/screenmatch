import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        Serie lost = new Serie();

        filmeUm.setNome("Carros");
        filmeUm.setAnoDeLancamento(2008);
        filmeUm.setCategoria("Animação");
        filmeUm.setTempoDeDuracao(105);
        filmeUm.setIncluidoNoPlano(true);
        filmeUm.setDiretor("Tarantino");

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(9);
        filmeUm.avalia(6);
        filmeUm.avalia(7);

        System.out.println();
        System.out.println(filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.pegaMedia());

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2007);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        


    }
}
