package desafios;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;
    public ListaTarefas(){
        this.listaTarefa = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa removerTarefa = null;
        if(this.listaTarefa.isEmpty()){
            System.out.println(" lista de tarefa vazia");
            return;
        }
        for(Tarefa tarefa : this.listaTarefa){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefa = tarefa;
                break;
            }
        }
        this.listaTarefa.remove(removerTarefa);
    }
    public void exibirTarefas(){
        System.out.println(this.listaTarefa);
    }
    public int contarTarefas(){
        return this.listaTarefa.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConscluidas = new HashSet<>();
        for(var tarefa : this.listaTarefa){
            if(tarefa.isTarefaConcluida()){
                tarefasConscluidas.add(tarefa);
            }
        }

        return tarefasConscluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(var tarefa : this.listaTarefa){
            if(!tarefa.isTarefaConcluida()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }
    public Tarefa marcarTarefaConcluida(String descricao){
       Tarefa tarefaAtualizada = null;
       if(this.listaTarefa.isEmpty()){
           throw new RuntimeException("a lista está vazia");
       }
       for(var tarefa : this.listaTarefa){
           if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
               tarefa.setTarefaConcluida(true);
               tarefaAtualizada = tarefa;
               break;
           }
       }
       return tarefaAtualizada;
    }
    public  Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaAtualizada = null;
        if(this.listaTarefa.isEmpty()){
            throw  new RuntimeException("A lista está vazia");
        }
        for(var tarefa : this.listaTarefa){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setTarefaConcluida(false);
                tarefaAtualizada = tarefa;
                break;
            }
        }
        return tarefaAtualizada;
    }

    public void limparListaTarefas(){
        this.listaTarefa.removeAll(this.listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
        System.out.println("Obtendo tarefas pendentes");
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}