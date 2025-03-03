import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        //usa o Suppler com expressão lambda para fornercer uma saudação personalizada
        Supplier<String> saudacao = ()->"Olá, seja bem vindo :)";
        // Usa o Supplier para obter uma lista com 5 saudações
        List<String> listaSadacao = Stream.generate(saudacao)
                .limit(5)
                .toList();
        //imprimir as saudações geradas
        listaSadacao.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        //outro exemplo usando lambda
        List<String> listaOlaMundo = Stream.generate(()-> "Olá mundo")
                .limit(10)
                .toList();
        listaOlaMundo.forEach(System.out::println);
    }

}