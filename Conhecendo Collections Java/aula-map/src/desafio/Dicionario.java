package desafio;
import java.util.HashMap;
import java.util.Map;
public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String descricao){
        this.dicionario.put(palavra, descricao);
    }
    public void removerPalavra(String palavra){
        if(this.dicionario.isEmpty()){
            System.out.println("dicionario vazio");
            return;
        }
        this.dicionario.remove(palavra);
    }
    public  void exibirPalavras(){
        System.out.println(this.dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        if(this.dicionario.isEmpty()){
            throw  new RuntimeException("O dicionário está vazio");
        }
        return this.dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
