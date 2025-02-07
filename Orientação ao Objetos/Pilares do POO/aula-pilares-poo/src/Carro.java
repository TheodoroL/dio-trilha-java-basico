public class Carro extends Veiculo {
    // entendendo encapsulamento
    @Override
    public void ligar(){
        conferirCambio();
        conferirCobumstivel();
        System.out.println("Carro ligado");
    }
    private  void conferirCobumstivel(){
        System.out.println("conferindo o combustivel");
    }
    private   void conferirCambio(){
        System.out.println("conferindo cambio em P");
    }
}
