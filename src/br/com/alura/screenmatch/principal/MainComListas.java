package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainComListas {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();

        Filme filme1 = new Filme("Dogville", "Aventura", 2003, true, 200, "Brad Pitt");
        Filme filme2 = new Filme("Thunderbolts", "Heróis", 2025, false, 240, "Irmãos Krasinski");
        Filme filme3 = new Filme("Os Incriveis 2", "Desenho", 2019, true, 190, "David Wallace");
        Serie lost = new Serie("Lost", "Suspense", 2000, true, false, 10,10, 50);

        filme1.avalia(8);
        filme2.avalia(9);
        filme3.avalia(10);

        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
        }
    }
}
