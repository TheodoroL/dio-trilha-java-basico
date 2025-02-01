public class CaixaElentronica {
    public static void main(String[] args) {
        double saldo = 25;
        double salarioSoliciado = 17;
        //condicional simples
        if(salarioSoliciado < saldo)
            saldo-=salarioSoliciado;

        System.out.println(saldo);
    }
}
