package com.example.map.pesquisa;

public class Produtos {
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString() {
        return "Produtos [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
