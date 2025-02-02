import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("tocando telefone...");
        }while (tocando());
        System.out.println("Alô ");
    }
    private static  boolean tocando(){
        return new Random().nextInt(3) ==1;
    }
}
