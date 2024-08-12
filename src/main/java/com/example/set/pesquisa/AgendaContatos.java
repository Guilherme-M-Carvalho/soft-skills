package com.example.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contato = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contato = c;
                break;
            }
        }
        return contato;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContato();

        agenda.adicionarContato("Guilherme", 12);
        agenda.adicionarContato("Jose", 1234);
        agenda.adicionarContato("Jose antonio", 1234);
        agenda.adicionarContato("Guilherme 1", 123);
        agenda.adicionarContato("Guilherme 2", 124);
        agenda.adicionarContato("Guilherme 3", 125);
        agenda.exibirContato();
        
        System.out.println(agenda.pesquisarPorNome("Jose"));

        System.out.println("Contato atualizado: "+ agenda.atualizarNumeroContato("Jose antonio", 5555555));
        agenda.exibirContato();
    }
}
