package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.SacolaDeCompras;

import java.time.LocalDate;
import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        // Primeiro Livro
        AudioBook primeioLivro = new AudioBook();
        primeioLivro.setTitulo("Brawl Stars");
        primeioLivro.setAutor("Supercell");
        primeioLivro.setNarrador("Spike");
        primeioLivro.setEditora("Supercell Books");
        primeioLivro.setDuracao(LocalTime.of(6, 7));
        primeioLivro.setVersao(VersaoEnum.INTEGRAL);
        primeioLivro.setPreco(67.67);
        primeioLivro.setResumo("Entenda mais: Mentes geniais que criaram  o Brawl Stars");
        primeioLivro.setDataLancamento(LocalDate.now());
        primeioLivro.exibir();

        // Segundo Livro

        AudioBook segundolivro = new AudioBook();
        segundolivro.setTitulo("O segredo por tras do Francisco");
        segundolivro.setAutor("Todo mundo menos o Francisco");
        segundolivro.setNarrador("Chico Mestre");
        segundolivro.setEditora("Global, todo mundo menos o Francisco");
        segundolivro.setDuracao(LocalTime.of(6, 7));
        segundolivro.setVersao(VersaoEnum.INTEGRAL);
        segundolivro.setPreco(10.00);
        segundolivro.setResumo("Entenda mais sobre um mundo que todos conhecem: o Francisco");
        segundolivro.setDataLancamento(LocalDate.of(2026, 5, 5));
        segundolivro.exibir();

        AudioBook terceirolivro = new AudioBook();
        terceirolivro.setTitulo("O segredo por tras do Eduardo");
        terceirolivro.setAutor("Todo mundo menos o Eduardo");
        terceirolivro.setNarrador("Eduardo Mestre");
        terceirolivro.setEditora("Global, todo mundo menos o Eduardo");
        terceirolivro.setDuracao(LocalTime.of(6, 7));
        terceirolivro.setVersao(VersaoEnum.INTEGRAL);
        terceirolivro.setPreco(10.00);
        terceirolivro.setResumo("Entenda mais sobre um mundo que todos conhecem: o Eduardo");
        terceirolivro.setDataLancamento(LocalDate.of(2026, 5, 5));
        terceirolivro.exibir();

        AudioBook quartolivro = new AudioBook();
        quartolivro.setTitulo("O segredo por tras do Andrews");
        quartolivro.setAutor("Todo mundo menos o Andrews");
        quartolivro.setNarrador("Andrews Mestre");
        quartolivro.setEditora("Global, todo mundo menos o Andrews");
        quartolivro.setDuracao(LocalTime.of(6, 7));
        quartolivro.setVersao(VersaoEnum.INTEGRAL);
        quartolivro.setPreco(10.00);
        quartolivro.setResumo("Ensina conceitos fundamentais sobre educaçao financeira");
        quartolivro.setDataLancamento(LocalDate.of(2026, 5, 5));
        quartolivro.exibir();

        SacolaDeCompras sacola = new SacolaDeCompras();
        sacola.adicionar(primeioLivro);
        sacola.adicionar(segundolivro);
        sacola.adicionar(terceirolivro);
        sacola.adicionar(quartolivro);
        sacola.exibirTotal();
    }
}
