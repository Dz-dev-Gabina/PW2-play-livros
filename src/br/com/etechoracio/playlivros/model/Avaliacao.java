package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;

public class Avaliacao {
    public int estrelas;
    public String titulo;
    public LocalDateTime data;
    public String comentario;
    public Usuario usuario;  /// Composição || agregação
    public boolean aprovado;

    public void exibirDados(){
        System.out.println(usuario.nome);
        System.out.println(estrelas + " estrelas " + titulo );
        System.out.println("Avaliado em: " + data);
        System.out.println(comentario);
    }
}
