package apps;

public class MSNMessage extends  ServicoMensagemInstancia {
    //rescrevendo os métodos da classe pai
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
