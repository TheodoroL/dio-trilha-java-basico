import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //Lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        //usa o BinaryOperator com expressão lambda para somar todos os números da stream
        BinaryOperator<Integer> somar = (n1, n2)-> n1+n2;

        int resultadoSoma = numeros.stream().reduce(0, somar);
        System.out.printf("A soma de todos os números é %d\n", resultadoSoma);

        //usando classe anônima
        int resultadoMultiplicando = numeros.stream()
                .reduce(1, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer n1, Integer n2) {
                        return n1*n2;
                    }
                });
        System.out.printf("A multiplicação de todos os números é %d\n", resultadoMultiplicando);

        //usando lambda
        int subtracaoTodosNumeros = numeros.stream()
                .reduce(0, (n1, n2)-> n1-n2);
        System.out.printf("A subtração de todos números é %d\n", subtracaoTodosNumeros);
    }
}