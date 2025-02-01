import java.util.Scanner;
public class ContaTerminal {
   static int numeroConta;
   static String agencia;
   static String nomeCliente;
   static double saldo;
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        if(args.length!=4){
            Cadastrar();
            return;
        }
        numeroConta = Integer.parseInt(args[0]);
        agencia = args[1];
        nomeCliente = args[2];
        saldo = Double.parseDouble(args[3]);
        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d] e seu saldo [%.2f] já está disponível para saque", nomeCliente, agencia, numeroConta,saldo );

    }
    public static void Cadastrar(){
        System.out.print("Digite o número:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agencia :");
        agencia = scanner.nextLine();
        System.out.print("Digite o seu nome :");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite o seu saldo:");
        saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta,saldo );
    }
}