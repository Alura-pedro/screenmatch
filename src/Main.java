import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        filmeUm.setNome("Carros");
        filmeUm.setAnoDeLancamento(2008);
        filmeUm.setCategoria("Animação");
        filmeUm.setDuracaoEmMinutos(105);
        filmeUm.setIncluidoNoPlano(true);
        filmeUm.setDiretor("Tarantino");

        filmeUm.avalia(9);
        filmeUm.avalia(6);
        filmeUm.avalia(7);

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2007);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.printf("A série %s tem uma duração de %d minutos", lost.getNome(), lost.getDuracaoEmMinutos());
        System.out.printf("\nO filme %s tem uma duração de %d minutos", filmeUm.getNome(), filmeUm.getDuracaoEmMinutos());

        calculadora.inclui(filmeUm);
        calculadora.inclui(lost);
        System.out.printf("\n %d", calculadora.getTempoTotal());
    }
}
