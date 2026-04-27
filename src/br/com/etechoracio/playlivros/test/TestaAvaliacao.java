package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TestaAvaliacao {
    static void main() {
        Usuario horacio =  new Usuario();
        horacio.nome = "Horacio Augusto da Silveira";

        Avaliacao primeiraAvaliacao = new Avaliacao();
        primeiraAvaliacao.usuario = horacio;
        primeiraAvaliacao.estrelas = 5;
        primeiraAvaliacao.data = LocalDateTime.now();
        primeiraAvaliacao.aprovado = true;
        primeiraAvaliacao.titulo = "Livro Excelente";
        primeiraAvaliacao.comentario = "Livro excelente, muito bem escrito. Chegou no prazo e bem embalado";

        primeiraAvaliacao.exibirDados();


    }
}
