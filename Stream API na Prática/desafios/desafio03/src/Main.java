import java.util.Arrays;
import java.util.List;

//    Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3,4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean positivo = numeros.stream().allMatch(n -> n> 0);
        System.out.printf("A lista é tudo positivo ? %b\n", positivo);
    }
}