//biblioteca para gerar números aleatórios
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;
        //while
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor: %.2f\n", valorDoce);
            mesada-=valorDoce;

        }
        System.out.printf("Mesada: %.2f\n", mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doce ");

    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
