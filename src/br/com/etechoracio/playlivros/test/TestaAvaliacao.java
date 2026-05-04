package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TestaAvaliacao {
    static void main() {
        Usuario horacio =  new Usuario();
        horacio.nome = "Horacio Augusto da Silveira";

        Usuario renata = new Usuario();
        renata.nome = "Renata Maciel";

        Avaliacao primeiraAvaliacao = new Avaliacao();
        primeiraAvaliacao.usuario = horacio;
        primeiraAvaliacao.adicionar(5);
        primeiraAvaliacao.data = LocalDateTime.now();
        primeiraAvaliacao.aprovado = true;

        primeiraAvaliacao.exibirDados();

        Avaliacao segundoAvaliacao = new Avaliacao();
        segundoAvaliacao.usuario = renata;
        segundoAvaliacao.adicionar(5,"Bom","Para mim que tenho filho maior que 5 anos, não achei interessante.");
        segundoAvaliacao.data = LocalDateTime.now();
        segundoAvaliacao.aprovado = true;

        segundoAvaliacao.exibirDados();

    }
}
