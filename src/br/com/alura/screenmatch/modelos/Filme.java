package br.com.alura.screenmatch.modelos;

import org.w3c.dom.ls.LSOutput;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
