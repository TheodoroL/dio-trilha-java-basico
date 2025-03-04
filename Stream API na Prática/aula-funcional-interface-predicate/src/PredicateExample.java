import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //cria uma lista de String
        List<String> palavras = Arrays.asList("Java", "C#", "Python", "Go","Zig", "Lua","Luau",  "Elixir", "Javascript", "Kotlin", "Ruby");
        //Cria um Predicate que verifica se a palavra tem mais de que 5 caracteres
        Predicate<String> maisQueCincoCaracteres = palavra -> palavra.length() >5;
        //Usar o Stream para filtrar as palavras que tem mais de 5 caracteres e, em seguida,
        //imprimir cada palavra passou no filtro
        palavras.stream()
                .filter(maisQueCincoCaracteres)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        //Usando classe anônima
        palavras.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() <5;
                    }
                })
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        //Usando lambda
        palavras.stream()
                .filter(palavra -> palavra.length() > 2 && palavra.length() < 5)
                .forEach(System.out::println);
    }

}