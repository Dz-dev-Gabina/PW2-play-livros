public class TestaReferencias {

    static void main() {
        // tipo nome valor -> declaração de variável
        Livro livroA = new Livro();
        livroA.titulo = "Meu Livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu livro B";
        System.out.println(livroB.titulo);

        System.out.println(livroA.titulo);
    }
}