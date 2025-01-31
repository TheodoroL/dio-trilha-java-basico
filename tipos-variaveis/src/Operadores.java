public class Operadores {
    public static void main(String[] args) {
        int valor = 10;
        int valor2 = 11;
        //parte do operador ternário

        String mensagem = valor == valor2 ?  String.format("O valor %d é igual ao valor %d", valor, valor2):String.format("O valor %d é diferente do valor %d", valor, valor2);

        System.out.println(mensagem);

    }
}
