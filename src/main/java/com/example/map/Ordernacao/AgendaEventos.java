package com.example.map.Ordernacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento "+ entry.getValue() + "acontecera na data "+ entry.getKey());
                break;
            }
        }
    }   

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024, 7, 01), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 02), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 03), "Evento 2", "Atração 12");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 13), "Evento 2", "Atração 12");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
