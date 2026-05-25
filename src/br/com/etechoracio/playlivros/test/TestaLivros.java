package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.LivroImpresso;

import java.time.LocalTime;

public class TestaLivros {
    static void main() {
        LivroImpresso quartoLivro = new LivroImpresso();
        quartoLivro.setTitulo("Pai Rico, Pai Pobre");
        quartoLivro.setAutor("Roberto Kiyosaki");
        quartoLivro.setNarrador("Marcelo Sanches");
        quartoLivro.setEditora("Alta Books");
        quartoLivro.setDuracao(LocalTime.of(6, 15));
        quartoLivro.setVersao(VersaoEnum.INTEGRAL);
        quartoLivro.setPreco(19.90);
        quartoLivro.setPaginas(197);
        quartoLivro.setResumo("Ensina conceitos fundamentais sobre Educação Financeira");
    }
}
