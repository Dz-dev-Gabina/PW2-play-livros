package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Livro;

public class TestaReferencias {

    static void main() {
        // tipo nome valor -> declaração de variável
        Livro livroA = new Livro();
        livroA.titulo = "Meu br.com.etechoracio.playlivros.model.Livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu livro B";
        System.out.println(livroB.titulo);

        System.out.println(livroA.titulo);
    }
}