package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        System.out.println("Servindo mesa");
    }
    private   void pegarLancheCozinha(){
        System.out.println("pegando o lanche na cozinha");
    }
    public  void receberPagamento(){
        System.out.println("Recebendo Pagamento");
    }
     void trocarGas(){
        System.out.println("Atendente trocando o gás");
    }
    public  void pegarPedidoBalcao(){
        pegarLancheCozinha();
        System.out.println("Pegando o pedido no balcão");
    }
}
