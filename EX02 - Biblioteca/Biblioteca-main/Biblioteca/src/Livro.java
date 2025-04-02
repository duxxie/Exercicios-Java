public class Livro {
    String titulo;
    String autor;
    int ano;
    Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public static void exibirInfo(Livro livro){
        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.ano);
    }

}
