package OperacaoBasica;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer>  agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agenda.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(this.agenda.isEmpty()){
            System.out.println("A agenda está vazia");
            return;
        }
        this.agenda.remove(nome);
    }
    public void exibirContatos(){
        System.out.println(this.agenda);
    }
    public Integer pesquisarPorNome(String nome){
        if(this.agenda.isEmpty()){
            throw  new RuntimeException("A agenda está vazia");
        }
        return this.agenda.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
