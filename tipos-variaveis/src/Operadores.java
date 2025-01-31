public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero); // -5
        System.out.println(numero); // o resultado vai ser 5, pois o - não afetou a nossa variavel

        // Porém se eu fazer isso:
        numero = -numero;
        System.out.println(numero); // o resultado vai ser -5, pois o - afetou a nossa variavel

        // para tornar ele positivo novamente, basta fazer isso :
        numero = numero*-1;
        System.out.println(numero);
    }
}
