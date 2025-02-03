import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("digite o primeiro parâmetro:");
        int paramentroUm = scanner.nextInt();
        System.out.print("digite o segundo parâmetro:");
        int paramentroDois = scanner.nextInt();
        try {
            contar(paramentroUm, paramentroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        finally {
            scanner.close();
        }

    }
    public  static  void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException {
        if(paramentroUm > paramentroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem =   paramentroDois - paramentroUm;

        for(int contador = 1; contador<=contagem; contador++){
            System.out.printf("Imprimindo o número %d\n", contador);
        }
    }
}