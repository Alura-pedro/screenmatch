package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("\nEstá entre os preferidos do momento.");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("\nMuito bem avaliado no momento!");
        } else {
            System.out.println("\nColoque na sua lista para assistir depois.");
        }
    }
}
