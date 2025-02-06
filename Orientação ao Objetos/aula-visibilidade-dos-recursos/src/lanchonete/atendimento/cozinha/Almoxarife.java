package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");

    }
    private void controlarSaida(){
        System.out.println("Controlando a saida dos itens");
    }

    //pode ser default
    void entregarIgredientes(){
        controlarEntrada();
        System.out.println("Entregando igredientes");
    }

    //pode ser default
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás");
    }
}
