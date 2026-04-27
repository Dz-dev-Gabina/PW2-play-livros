package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalTime;

public class Livro {
    //tipo nomeVariavel;
    public String titulo;
    public String autor;
    public String narrador;
    public String editora;
    public LocalTime duracao;
    public VersaoEnum versao;
    public double preco;
    public String resumo;

    public void exibir(){
        System.out.println("===============================================");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Narrador: " + narrador);
        System.out.println("Editora: " + editora);
    }
}
 