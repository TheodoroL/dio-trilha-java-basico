package desafios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> listaPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.listaPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        listaPalavrasUnicas.add(palavra);
    }
    public  void removerPalavra(String palavra){
        String palavraRemover= null;
        if(this.listaPalavrasUnicas.isEmpty()){
            System.out.println("A lista está vazia");
            return;
        }
        for(var l :  this.listaPalavrasUnicas){
            if(l.equalsIgnoreCase(palavra)) {
                palavraRemover = palavra;
                break;
            }
        }
         this.listaPalavrasUnicas.remove(palavraRemover);
    }

    public boolean verificarPalavra(String palavra){
        return this.listaPalavrasUnicas.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(this.listaPalavrasUnicas);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

