public class ExemploForArray
{
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Daniel", "Leonardo", "Andressa"};
        //for
        for(int c = 0; c < nomes.length; c++){
            System.out.printf("O aluno no indice %d é %s\n", c, nomes[c]);
        }
        System.out.println("---------------------------");
        //foreach
        for (var nome : nomes){
            System.out.println(nome);
        }

    }
}
