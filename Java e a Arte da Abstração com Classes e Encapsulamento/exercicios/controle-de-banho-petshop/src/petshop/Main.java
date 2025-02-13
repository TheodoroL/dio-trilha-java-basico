package petshop;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private  final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        menu();
    }
    public  static void menu(){
        final String[] lista = {"Dar Banho no pet", "Abastecer a máquina com água", "Abastecer a máquina com shampoo", "Verificar água", "Verificar shampoo", "Verificar se tem pet no banho", "colocar pet na máquina", "retirar pet na máquina", "limpar maquina", "sair"};
        System.out.println("-------------------------------");
        for(int c= 0; c< lista.length; c++){
            System.out.printf("%d - %s\n", c+1, lista[c]);
        }
        System.out.println("-------------------------------");
        System.out.print("digite uma dessas opções:");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1 -> takeShowerPetMachine();
            case 2 -> addWaterPetMachine();
            case 3 -> addShampooPetMachine();
            case 4 ->  verifyShampoo();
            case 5 -> verifyWater();
            case 6 -> getHaspet();
            case 7 -> setPetInPetMachine();
            case 8 -> getPetFromMachine();
            case 9 -> washPetMachine();
            case 10 -> System.exit(0);
            default -> menu();
        }
    }
    public static  void setPetInPetMachine(){
        System.out.print("digite o nome do pet");
        String nome = "";
        while (nome == null || nome.isEmpty()){
            System.out.print("diigte o nome:");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        petMachine.setPet(pet);
        menu();
    }
    public static   void getPetFromMachine(){
        petMachine.removePet();
        menu();
    }
    public static void getHaspet(){
        var pet = petMachine.hashPet();
        System.out.println(pet? "Tem pet na máquina": "Não tem pet");
        menu();
    }
    private static void verifyShampoo(){
        System.out.println(petMachine.getShampoo());
        menu();
    }
    private static void verifyWater(){
        System.out.println(petMachine.getWater());
        menu();
    }
    public static  void washPetMachine(){
        petMachine.wash();
        menu();
    }
    public static  void takeShowerPetMachine(){
        petMachine.takeShower();
        menu();
    }
    public  static  void addWaterPetMachine(){
        petMachine.addWater();
        menu();
    }
    public  static  void addShampooPetMachine(){
        petMachine.addShampoo();
        menu();
    }

}