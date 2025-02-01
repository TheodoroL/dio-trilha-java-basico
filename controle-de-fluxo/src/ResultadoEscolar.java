import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("digita a sua nota:");
        int nota = scanner.nextInt();
        //Operador Ternário
        String situacao = nota >=7 ? "Aprovado": nota>=5 && nota <7 ? "Prova de exame":"Reprovado";
        System.out.println(situacao);
        scanner.close();
    }
}
