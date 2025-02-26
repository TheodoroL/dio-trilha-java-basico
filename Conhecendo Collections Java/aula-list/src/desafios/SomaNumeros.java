package desafios;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public  void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }
    public int calcularSoma(){
        int count = 0;

        for(var n : this.listaNumeros){
            count+=n;
        }
        return count;
    }
    public  int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(this.listaNumeros.isEmpty()){
            throw  new RuntimeException("Lista de número vazia");
        }
        for(var n : this.listaNumeros){
            if(n > maior){
                maior = n;
            }
        }
        return maior;
    }

    public  int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(this.listaNumeros.isEmpty()){
            throw  new RuntimeException("Lista de número vazia");
        }
        for(var n : this.listaNumeros){
            if(n < menor){
                menor = n;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
