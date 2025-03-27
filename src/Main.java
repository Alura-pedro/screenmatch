import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Carros", "Animação", 2008, true, 10, 4, 105, "Tarantino");
        Serie lost = new Serie("Lost", "Suspense", 2007, true, 10, 3, 1000, 10, true, 10, 50);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        System.out.printf("A série %s tem uma duração de %d minutos", lost.getNome(), lost.getDuracaoEmMinutos());
        System.out.printf("\nO filme %s tem uma duração de %d minutos", filmeUm.getNome(), filmeUm.getDuracaoEmMinutos());

        calculadora.inclui(filmeUm);
        calculadora.inclui(lost);
        System.out.printf("\n %d", calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeUm);
    }
}
