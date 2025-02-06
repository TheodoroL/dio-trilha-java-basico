package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        var cozinheiro = new Cozinheiro();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        var atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        var cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
