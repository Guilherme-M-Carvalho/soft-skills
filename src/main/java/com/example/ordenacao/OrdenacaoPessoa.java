package com.example.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoaOrdenada = new ArrayList<>(pessoaList);
        Collections.sort(pessoaOrdenada);
        return pessoaOrdenada;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        
        ordenacaoPessoa.adicionarPessoa("Guilherme", 20, 1.78);
        ordenacaoPessoa.adicionarPessoa("Guilherme 2", 10, 1.79);
        ordenacaoPessoa.adicionarPessoa("Guilherme 3", 35, 1.56);

        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
    }
}


class ComparatorPorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}

