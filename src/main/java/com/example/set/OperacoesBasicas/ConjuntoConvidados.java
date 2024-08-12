package com.example.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCovidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Guilherme", 1);
        conjuntoConvidados.adicionarConvidado("Guilherme 2", 2);
        conjuntoConvidados.adicionarConvidado("Guilherme 4", 2);
        conjuntoConvidados.adicionarConvidado("Guilherme 3", 3);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");
        conjuntoConvidados.removerCovidadoPorCodigoConvite(1);
        conjuntoConvidados.exibirConvidados();
    }
}
