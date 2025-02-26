package desafios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }
   public void adicionarItem(String nome, double preco, int quantidade){
        this.listaItens.add(new Item(nome, preco, quantidade));
   }
   public  void removerItem(String nome){
        List<Item> listaRemoverItens = new ArrayList<>();
        if(this.listaItens.isEmpty()){
            System.out.println("A lista está vazia!");
            return;
        }
        for(var l : this.listaItens){
           if(l.getNome().equalsIgnoreCase(nome)){
               listaRemoverItens.add(l);
           }
        }
        this.listaItens.removeAll(listaRemoverItens);
   }
    public double calcularValorTotal(){
        double valorTotal = 0;
        if(this.listaItens.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }
        for(var l : this.listaItens){
            valorTotal+=(l.getPreco()* l.getQuantidade());
        }
        return  valorTotal;
    }

    public void exibirItens(){
        for(var l : this.listaItens){
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
