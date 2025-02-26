package operacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private  List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.listaTarefa.add(new Tarefa(descricao));
    }
    public  void removerTarefa(String descricao){
        List<Tarefa> listaTarefaRemover = new ArrayList<>();
        for(var t: this.listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaTarefaRemover.add(t);
            }
        }
         this.listaTarefa.removeAll(listaTarefaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        for(var t : this.listaTarefa){
            System.out.println(t.getDescricao());
        }
    }

}
