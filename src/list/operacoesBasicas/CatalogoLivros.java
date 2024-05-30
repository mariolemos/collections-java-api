package Santander.Collections.src.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, anoPublicacao, autor));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarporIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAno.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "listaLivros=" + listaLivros +
                '}';
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;


    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2002);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2012);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2012);

        catalogoLivros.adicionarLivro("Livro 50", "Autor 30", 2014);
        System.out.println("Lista de Livros: " + catalogoLivros.pesquisarporIntervaloAnos(2002, 2012));

    }
}
