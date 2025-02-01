import java.util.Scanner;
public class SistemaDeMedida {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("digite a sigla da camisa:");
        String sigla = scanner.nextLine();

        switch (sigla.toLowerCase()){
            case "p":
                System.out.println("Pequeno");
                break;

            case "m":
                System.out.println("Médio");
                break;

            case "g":
                System.out.println("Grande");
                break;
            default:
                System.out.println("não existe essa sigla");
                break;

        }
    }
}
