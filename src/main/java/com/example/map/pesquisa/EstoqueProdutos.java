package com.example.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutos;

    public EstoqueProdutos() {
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProdutos(Long cod, String nome, double preco, int quantidade){
        estoqueProdutos.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calculaValorTotalEstoque(){
        double totalEstoque = 0;
        if(!estoqueProdutos.isEmpty()){
            for (Produtos p : estoqueProdutos.values()) {
                totalEstoque += (p.getQuantidade() * p.getPreco());
            }
        }
        return totalEstoque;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produtos p : estoqueProdutos.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();
        estoque.adicionarProdutos(1l, "Produto 1", 1.0,12);
        estoque.adicionarProdutos(2l, "Produto 2", 50.0,1);
        estoque.adicionarProdutos(4l, "Produto 4", 15.0,3);
        estoque.adicionarProdutos(3l, "Produto 3", 51.0,19);
        estoque.exibirProdutos();

        System.out.println(estoque.calculaValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
