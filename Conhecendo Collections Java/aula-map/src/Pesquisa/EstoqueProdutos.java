package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;
    public  EstoqueProdutos(){
        this.estoque = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoque.put(cod, new Produto(nome,quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(this.estoque);
    }
   public double calcularValorTotalEstoque(){
        double totalEstoque =0;
        if(this.estoque.isEmpty()){
            throw  new RuntimeException("estoque vazio");
        }

        for(var produto : this.estoque.values()){
            totalEstoque+= (produto.getPreco()*produto.getQuantidade());
        }
        return  totalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        double produtoMaisCaro= Double.MIN_VALUE;
        Produto produtoCaro = null;
        if(this.estoque.isEmpty()){
            throw new RuntimeException("estoque está vazio");
        }
        for(var produto : this.estoque.values()){
                if(produto.getPreco() > produtoMaisCaro){
                    produtoMaisCaro = produto.getPreco();
                    produtoCaro = produto;
                }
        }
        return produtoCaro;
    }

    public Produto obterProdutoMaisBarato(){
        double produtoMaisBarato= Double.MAX_VALUE;
        Produto produtoBarato = null;
        if(this.estoque.isEmpty()){
            throw new RuntimeException("estoque está vazio");
        }
        for(var produto : this.estoque.values()){
            if(produto.getPreco() < produtoMaisBarato){
                produtoMaisBarato = produto.getPreco();
                 produtoBarato = produto;

            }
        }
        return produtoBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double valor = Double.MIN_VALUE;
        Produto obeterProdutoMaiorQuantidadeValor = null;
        if(this.estoque.isEmpty()){
            throw  new RuntimeException("estoque está vazio");
        }
        for(var produto : this.estoque.values()){
            double v = produto.getPreco()*produto.getQuantidade();
            if(v > valor){
                valor = v;
                obeterProdutoMaiorQuantidadeValor = produto;
            }
        }
        return  obeterProdutoMaiorQuantidadeValor;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
