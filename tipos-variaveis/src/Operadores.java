public class Operadores {
    public static void main(String[] args) {
        int valor = 10;
        int valor2 = 11;
        System.out.println(valor== valor2); // false
        System.out.println(valor > valor2); // false
        System.out.println(valor >= valor2); // false
        System.out.println(valor < valor2); // true
        System.out.println(valor <= valor2); // true
        System.out.println(valor != valor2); // true

        if(valor < valor2){
            System.out.println("O valor é maior que valor2");
        }

        String nome1 = "TheodoroL";
        String nome2 = "TheodoroL";
        System.out.println(nome1 == nome2); // true
        nome2 = new String("TheodoroL");
        System.out.println(nome1 == nome2); // false, porque aqui nós está comparando 2 objetos
        System.out.println(nome1.equals(nome2)); // true, porque invés de comparar dois objetos ele vai comparar os conteudos desses objetos

    }
}
