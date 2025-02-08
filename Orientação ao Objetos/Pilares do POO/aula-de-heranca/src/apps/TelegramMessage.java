package apps;

public class TelegramMessage extends ServicoMensagemInstancia {
    //rescrevendo os métodos da classe pai
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
