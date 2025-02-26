import operacoesBasica.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");
        listaTarefas.removerTarefa("tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}