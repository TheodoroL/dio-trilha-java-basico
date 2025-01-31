public class TiposVariaveis {
    public static void main(String[] args)
    {
        // entendendo a diferença entre variavel e variavel constante

        //variavel
        int valor = 5;
        valor = 10;
        System.out.println(valor); // vai aparecer valor 10, pq nós fez a troca de valor :)

        // constante
        final double  VALOR_DE_PI = 100; // para fins de boa prática, todas as constantes tem que em CAPSLOCK
        //VALOR_DE_PI = 100; // Se nós tentar trocar o valor de pi vai dar erro, pq ela é uma constante
        System.out.println(VALOR_DE_PI);
        String nome = "TheodoroL"; // representação de um texto
        System.out.println(nome);
    }
}