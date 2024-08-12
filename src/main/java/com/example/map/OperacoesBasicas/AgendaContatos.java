package com.example.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer num = null;
        if(!agendaContatoMap.isEmpty()){
            num = agendaContatoMap.get(nome);
        }
        return num;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Guilherme", 11);
        agenda.adicionarContato("Guilherme", 112);
        agenda.adicionarContato("Guilherme 2", 11234);
        agenda.adicionarContato("Guilherme 3", 1123456);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Guilherme 2"));
    }
}
