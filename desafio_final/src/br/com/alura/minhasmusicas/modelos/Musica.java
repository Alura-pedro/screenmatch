package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album = "";
    private String cantor = "";
    private String genero = "";

    public Musica(String titulo, int duracao, String album, String artista, String genero) {
        super(titulo, duracao);
        this.album = album;
        this.cantor = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
