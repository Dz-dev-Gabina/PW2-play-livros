package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        // Primeiro Livro
        Livro primeioLivro = new Livro();
        primeioLivro.titulo = "Brawl Stars";
        primeioLivro.autor = "Supercell";
        primeioLivro.narrador = "Spike";
        primeioLivro.editora = "Supercell Books";
        primeioLivro.duracao = LocalTime.of(6, 7);
        primeioLivro.versao = VersaoEnum.INTEGRAL;
        primeioLivro.preco = 67.67;
        primeioLivro.resumo = "Entenda mais: Mentes geniais que criaram  o Brawl Stars";


    }
}
