public class Autodromo {
    public static void main(String[] args) {
        Carro unoComEscada = new Carro();
//        unoComEscada.ligar();
        unoComEscada.setChassi("1321313123");

        Moto z400 = new Moto();
        z400.setChassi("1312231");
/*        System.out.println(z400.getChassi());
        z400.ligar();*/

        Veiculo veiculoCoringa = z400; // aqui temos o "Carro Coringa", que mantem o método ligar de cada carro
        veiculoCoringa.ligar();

        veiculoCoringa = unoComEscada;
        veiculoCoringa.ligar();

    }
}
