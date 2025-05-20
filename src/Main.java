import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        var filme1 = new Filme("Dogville", "Aventura", 2003, true, 200, "Brad Pitt");
        var filme2 = new Filme("Thunderbolts", "Heróis", 2025, false, 240, "Irmãos Krasinski");
        var filme3 = new Filme("Os Incriveis 2", "Desenho", 2019, true, 190, "David Wallace");

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamnho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do filme: " + listaDeFilmes.get(0).getDiretor());
        System.out.println(listaDeFilmes);
    }
}
