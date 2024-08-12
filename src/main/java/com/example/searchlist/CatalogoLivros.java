package com.example.searchlist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int ano){
        this.livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntevalo(int ano, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= ano && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros cata = new CatalogoLivros();
        cata.adicionarLivro("Livro 1", "Autor 1", 2024);
        cata.adicionarLivro("Livro 2", "Autor 2", 2021);
        cata.adicionarLivro("Livro 3", "Autor 3", 2022);
        System.out.println(cata.pesquisarPorAutor("Autor 2"));
        System.out.println(cata.pesquisarPorIntevalo(2020, 2022));
        System.out.println(cata.pesquisarPorTitulo("Livro 2"));
    }
}
