import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        //usa o Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero-> numero*2;

        //usar a função para dobrar todos os números no stream e armazenar-los em outra lista
        List<Integer> numerosDobrados= numeros.stream()
                .map(dobrar)
                .toList();

        numeros.forEach(System.out::println);
        System.out.println("--------------------------------------------");
        numerosDobrados.forEach(System.out::println);

        //usando Funções Anônimas
        List<Integer> numerosTriplicado = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer*3;
                    }
                })
                .toList();
        System.out.println("--------------------------------------------");
        numerosTriplicado.forEach(System.out::println);

        //usando lambda
        List<Integer>numerosQuadriplicado = numeros.stream()
                .map(numero-> numero*4)
                .toList();
        System.out.println("--------------------------------------------");
        numerosQuadriplicado.forEach(System.out::println);
    }


}