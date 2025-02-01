import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        // inicia o scanner
        var scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite o seu nome:");
        //pega o nome da pessoa
        String nome = scanner.next();
        //pega a idade da pessoa
        System.out.print("Digite a sua idade:");
        int idade = scanner.nextInt();
        //pega a altura da pessoa
        System.out.print("Digite a sua altura");
        double altura = scanner.nextDouble();
        System.out.printf("nome: %s\nidade: %d\naltura: %.2f", nome, idade, altura);
    }
}