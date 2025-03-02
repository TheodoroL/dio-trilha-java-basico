package desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> lista;

    public ContagemPalavras(){
        this.lista = new HashMap<>();
    }

    public  void adicionarPalavras(String palavra, Integer contagem){
        this.lista.put(palavra, contagem);
    }
    public  void removerPalavra(String  palavra){
        if(this.lista.isEmpty()){
            throw  new RuntimeException("A lista de palavra está vazia");
        }
        this.lista.remove(palavra);
    }
    public  Map<String, Integer> exibirContagemPalavras(){
        return this.lista;
    }

    public String encontrarPalavrasMaisFrequente(){
        String palavraMaisFrequente = null ;
        int contador = Integer.MIN_VALUE ;

        if(this.lista.isEmpty()){
            throw new RuntimeException("A lista de palavra está vazia");
        }
        for(var palavra : this.lista.keySet()){
            int c = this.lista.get(palavra);
            if(c > contador){
                contador = c;
                palavraMaisFrequente = palavra;
            }
        }

        return  palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        //Remover uma linguagem
        contagemLinguagens.removerPalavra("Python");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
