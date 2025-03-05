import java.util.Arrays;
import java.util.List;

public class Main {
//    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int totalValor = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);
        int quantidade = (int) numeros.stream()
                        .filter(n-> n > 5)
                        .count();

        if(quantidade!= 0){
            double mediaAlunos = (double) totalValor/quantidade;
            System.out.printf("a media dos alunos maior que 5 é %.2f",  mediaAlunos );
        }
        }
}