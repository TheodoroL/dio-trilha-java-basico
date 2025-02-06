public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values() ){
            System.out.printf("%s - %s\n", e.getSigla(), e.getNome());
        }
        EstadoBrasileiro estado = EstadoBrasileiro.MATO_GROSSO_SUL;
        System.out.println(estado.getSigla());
        System.out.println(estado.getNome());
        System.out.println(estado.getNomeMaiusculo());
    }
}
