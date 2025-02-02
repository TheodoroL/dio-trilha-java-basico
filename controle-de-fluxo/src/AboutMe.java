import java.util.InputMismatchException;
import  java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        try {


            var scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("digite o seu nome:");
            String name = scanner.nextLine();
            System.out.print("digite o seu sobrenome:");
            String surname = scanner.nextLine();
            System.out.print("digite a sua idade:");
            int age = scanner.nextInt();
            System.out.print("digite a sua altura:");
            double height = scanner.nextDouble();

            System.out.printf("Nome: %s\nSobrenome: %s\nidade: %d\naltura: %.2f\n", name, surname, age, height);

        }
        catch ( InputMismatchException e){
            System.err.println("Os  campos idade e altura tem que ser numérico");
        }
        finally {
            System.out.println("Obrigado por usar o nossa app :)");
        }
    }
}
