package com.example.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    public Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProdutos(String nome, long codigo, int preco, int quantidade){
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.produtos);
        cadastroProdutos.adicionarProdutos("Produto 3",1l, 15, 5);
        cadastroProdutos.adicionarProdutos("Produto 0",2l, 20, 10);
        cadastroProdutos.adicionarProdutos("Produto 5",1l, 10, 2);
        cadastroProdutos.adicionarProdutos("Produto 9",9l, 2, 2);
        System.out.println(cadastroProdutos.produtos);
        System.out.println(cadastroProdutos.exibirPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}


class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
    
}