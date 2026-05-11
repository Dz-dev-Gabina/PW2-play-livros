package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
    public int estrelas;
    public String titulo;
    public LocalDateTime data;
    public String comentario;
    public Usuario usuario;  /// Composição || agregação
    private boolean aprovado;

    public void exibirDados(){
        if (aprovado) {
            System.out.println("   ");
            System.out.println(usuario.getnome);
            System.out.println(estrelas + " estrelas " + titulo );
            System.out.println("Avaliado em: " + obterDataPorExtenso());
            System.out.println(comentario);
        }
    }

    // visibilidade retorno nome

    public String obterDataPorExtenso(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        String resultado = formatador.format(data);
        return resultado; // return
    }
    // Definido estrtela = nota
    public void adicionar(int nota) {
        this.estrelas = nota;
    }

    public void adicionar(int nota, String comentario){
        this.estrelas = nota;
        this.comentario = comentario;
    }

    public void adicionar(int nota, String titulo, String comentario){
        this.estrelas = nota;
        this.titulo = titulo;
        this.comentario = comentario;
    }
    public void aprovar(){
        // Verificar se possui termos ofensivos
        this.aprovado = true;
    }
}
