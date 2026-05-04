package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        primeioLivro.dataLancamento = LocalDate.now();
        primeioLivro.exibir();

        // Segundo Livro

        Livro segundolivro = new Livro();
        segundolivro.titulo = "O segredo por tras do Francisco";
        segundolivro.autor = "Todo mundo menos o Francisco";
        segundolivro.narrador = "Chico Mestre";
        segundolivro.editora = "Global, todo mundo menos o Francisco";
        segundolivro.duracao = LocalTime.of(6, 7);
        segundolivro.versao = VersaoEnum.INTEGRAL;
        segundolivro.preco = 10.00;
        segundolivro.resumo = "Entenda mais sobre um mundo que todos conhecem: o Francisco";
        segundolivro.dataLancamento = LocalDate.of(2026, 5, 5);
        segundolivro.exibir();
    }
}
