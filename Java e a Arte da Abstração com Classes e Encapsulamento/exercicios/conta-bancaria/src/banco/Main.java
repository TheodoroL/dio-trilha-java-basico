package banco;

import banco.conta.Conta;
import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("digite o seu nome:");
        String nome = scanner.nextLine();
        System.out.print("digite o seu cpf:");
        String cpf = scanner.nextLine();
        System.out.print("digite o dinheiro como primeiro saldo:");
        double saldo = scanner.nextDouble();

        var conta = new Conta(nome, cpf, saldo);
        menu(conta);
    }
    public static void menu(Conta conta){
        String[] lista = {"Sacar", "Depositar","Pagar boleto","Ver saldo", "Ver cheque especial", "Informação do perfil" ,"Sair"};
        System.out.println("---------------------------");
        for(int c = 0; c < lista.length; c++){
            System.out.printf("%d  %15s\n",c+1, lista[c]);
            System.out.println("---------------------------");
        }
        System.out.print("digite uma dessas opções:");
        int selecionar = scanner.nextInt();
        switch (selecionar){
            case 1 ->clienteSacar(conta);
            case 2 -> clienteDepositar(conta);
            case 3 -> clientePagarBoleto(conta);
            case 4 -> consultarSaldo(conta);
            case 5-> consultarChequeEspecial(conta);
            case 6 -> mostrarInfo(conta);
            case 7 -> {System.out.println("saindo do banco");
                scanner.close();
            }
            default -> menu(conta);
        }
    }
    public static void clienteSacar(Conta cliente){
        System.out.print("digite o valor que você quer sacar:");
        double dinheiro = scanner.nextDouble();
        cliente.sacar(dinheiro);
        menu(cliente);
    }

    public static void clienteDepositar(Conta cliente){
        System.out.print("digite o valor que você quer depositar:");
        double dinheiro = scanner.nextDouble();
        cliente.depositar(dinheiro);
        menu(cliente);
    }
    public  static  void clientePagarBoleto(Conta cliente){
        System.out.print("digite o valor do boleto:");
        double dinheiro = scanner.nextDouble();
        cliente.pagarBoleto(dinheiro);
        menu(cliente);
    }
    public static void mostrarInfo(Conta cliente){
        cliente.mostrarInfo();
        menu(cliente);
    }
    public  static  void consultarChequeEspecial(Conta cliente){
        System.out.println(cliente.consultarChequeEspecial());
        menu(cliente);
    }
    public  static  void consultarSaldo(Conta cliente){
        System.out.println(cliente.consultarSaldo());
        menu(cliente);
    }
}