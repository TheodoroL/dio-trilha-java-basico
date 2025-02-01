import java.util.Scanner;
public class PlanoOperadora {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("digite a sigla do plano que você quer:");
        String sigla = scanner.nextLine();
        switch (sigla.toUpperCase()){
            case "T":
                System.out.println("5gb Youtube");
            case "M":
                System.out.println("Whats e Instagram gratis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
        scanner.close();
    }
}
