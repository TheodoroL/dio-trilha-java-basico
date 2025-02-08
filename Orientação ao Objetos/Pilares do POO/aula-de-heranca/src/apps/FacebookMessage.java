package apps;

public class FacebookMessage extends ServicoMensagemInstancia {
    //rescrevendo os métodos da classe pai
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
