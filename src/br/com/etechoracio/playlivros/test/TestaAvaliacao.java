package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TestaAvaliacao {
    static void main() {

        Avaliacao primeiraAvaliacao = new Avaliacao();

        primeiraAvaliacao.usuario = new Usuario("Horacio Augusto da Silveira");
        primeiraAvaliacao.adicionar(5,"Bom","Gostei bastante do livro, parabens!!!");
        primeiraAvaliacao.data = LocalDateTime.now();
        primeiraAvaliacao.aprovado = true;

        primeiraAvaliacao.exibirDados();
        System.out.print("\n");
        //----------------------------------------------

        Avaliacao segundoAvaliacao = new Avaliacao();
        segundoAvaliacao.usuario = new Usuario("Renata Maciel");
        segundoAvaliacao.adicionar(5,"Bom","Para mim que tenho filho maior que 5 anos, não achei interessante.");
        segundoAvaliacao.data = LocalDateTime.now();
        segundoAvaliacao.aprovado = true;

        segundoAvaliacao.exibirDados();
        System.out.print("\n");
        //-----------------------------------------------
    }
}
