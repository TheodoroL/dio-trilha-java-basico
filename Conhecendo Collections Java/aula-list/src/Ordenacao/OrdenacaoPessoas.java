package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.listaPessoa.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(this.listaPessoa);
        Collections.sort(listaOrdenada); // ordena a lista com a idade
        return listaOrdenada;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(this.listaPessoa);
        Collections.sort(listaOrdenada, new ComparatorPorAltura());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        //Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.getListaPessoa());

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
