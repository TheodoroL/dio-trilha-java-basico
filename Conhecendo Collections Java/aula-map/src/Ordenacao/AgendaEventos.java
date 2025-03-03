package Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private final  Map<LocalDate,Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }
    public  void adicionarEvento(LocalDate data, String nome, String atracao){
        this.agenda.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> ordenarEvento = new TreeMap<>(this.agenda);
        System.out.println(ordenarEvento);
    }
    public void obterProximoEvento(){
        //retorna um set das keys da agenda
//        Set<LocalDate> dataSet=  this.agenda.keySet();
//        //retorna um collection dos values da agenda
//        Collection<Evento> valores = this.agenda.values();

         LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> ordenarEvento = new TreeMap<>(this.agenda);
        //com esse método pode retonar um set que aponta o key e o value
        for(var e: ordenarEvento.entrySet()){
            if(e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual)){
                System.out.printf("O proximo evento vai ser : %s vai acontecer na data %s\n", e.getValue(),e.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }

}
