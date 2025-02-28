package Ordenacao;


import java.util.Comparator;

public class Produtos implements Comparable<Produtos> {
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //comparar com nome do produto
    @Override
    public int compareTo(Produtos p) {

        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



    @Override
    public String toString() {
        return "Produtos{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}

class ComparatorPreco implements Comparator<Produtos> {
    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}