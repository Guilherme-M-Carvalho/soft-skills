package com.example.demo;
import java.util.ArrayList;
import java.util.List;

public class ListTarefa {
    private List<Tarefa> tarefaList;
    
    public ListTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotal(){
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListTarefa listTarefa = new ListTarefa();
        System.out.println("O numero total de elementos é: " + listTarefa.obterNumeroTotal());
        listTarefa.adicionarTarefa("Tarefa 1");
        listTarefa.adicionarTarefa("Tarefa 1");
        listTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos é: " + listTarefa.obterNumeroTotal());

        listTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos é: " + listTarefa.obterNumeroTotal());
        listTarefa.obterDescricoesTarefas();
    }
}
