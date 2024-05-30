package Santander.Collections.src.list.operacoesBasicas;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private String autor;


    public Livro(String titulo, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tituloAutor='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", autor='" + autor + '\'' +
                '}';
    }
}
