public class Main {
    public static void main(String[] args) {
        IngressoFamilia ingressoFamilia = new IngressoFamilia("wqdqdwq", 10.0, "filme teste", "dublado", 10);
        System.out.println(ingressoFamilia.real());
        MeiaIngresso meiaIngresso = new MeiaIngresso("theodoro", 10, "Senhor dos Anéis", "dublado");

        System.out.println(meiaIngresso.real());
        }

}