public class Operadores {
    public static void main(String[] args) {
        // and : &&
        // o and basicamente vai ser verdadeiro se ambas condição ser verdadeira
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("Ambas  condições são verdadeiras");
        }

        // or : ||
        // o or basicamente vai ser verdadeiro se pelo menos uma condição ser verdadeira

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");

        }
    }
}
