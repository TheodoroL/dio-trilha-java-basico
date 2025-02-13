import java.util.Scanner;

public class Main {
    private  static  Scanner scanner = new Scanner(System.in);
    private  static  Carro  unoComEscada = new Carro();
    public static void main(String[] args) {
        int selecionar;

        do{
            menu();
            System.out.println("->");
            selecionar = scanner.nextInt();
            switch (selecionar){
                case 1 -> unoComEscada.ligarCarro();
                case 2 -> unoComEscada.desligarCarro();
                case 3 -> unoComEscada.acelerarCarro();
                case 4 -> unoComEscada.diminuirVelocidadeCarro();
                case 5 -> unoComEscada.direcaoEsquerda();
                case 6 -> unoComEscada.direcaoDireita();
                case 7 ->  unoComEscada.trocarMarcha();
                case 8 -> unoComEscada.diminuindoTrocaMarcha();
                case 9 -> System.out.print("Saindo do carro...");
            }
       }while (selecionar!=9);
        scanner.close();
    }
    public  static  void menu(){
        String[] lista = {"Ligar o carro", "Desligar o carro", "Acelerar", "Diminuir a velocidade", "Virar para Esquerda", "Virar Para direita","Trocar Marcha", "Diminuir a Marcha", "Sair do programa"};
        System.out.println("----------------------------------");
        for(int c = 0; c < lista.length; c++){
            System.out.printf("%d- %s\n", c+1, lista[c]);
        }
        System.out.println("----------------------------------");
    }
}