import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        //cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        //usa o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumerosPar = numero->{
            if(numero %2 == 0) System.out.println(numero);
            else System.out.println("impar");
        };

        //usa o Consumer para imprimir os números pares na Stream
        numeros.stream().forEach(imprimirNumerosPar);
        //usando a classe Consumer dentro do forEach
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer %2 == 1) System.out.println(integer);
                else System.out.println("par");
            }
        });
        //usando lambda e com java mais atualizado você não precisa usar .stream para usar o forEach
        numeros.forEach(numero->{
            if(numero %2 == 0) System.out.println("par");
            else System.out.println("Impar");
        });
    }
}