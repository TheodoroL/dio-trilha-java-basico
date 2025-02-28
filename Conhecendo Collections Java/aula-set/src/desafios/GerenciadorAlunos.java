package desafios;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double media){
        this.listaAlunos.add(new Aluno(nome, matricula, media));
    }
    public Aluno removerAlunoPorMatricula(long matricula){
        Aluno alunoRemovido = null;
        if(this.listaAlunos.isEmpty()){
            throw  new RuntimeException("Lista vazia");
        }
        for(var aluno: this.listaAlunos){
            if(aluno.getMatricula() == matricula){
                alunoRemovido = aluno;
                break;
            }
        }
        this.listaAlunos.remove(alunoRemovido);
        return alunoRemovido;
    }
    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(this.listaAlunos);
    }
    public Set<Aluno> exibirAlunosPorNota(){
       Set<Aluno> listaPorNota = new TreeSet<>(new ComparatorNotas());
       listaPorNota.addAll(this.listaAlunos);
        return listaPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.listaAlunos);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.listaAlunos);

        // Exibindo alunos ordenados por nome

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }

}
