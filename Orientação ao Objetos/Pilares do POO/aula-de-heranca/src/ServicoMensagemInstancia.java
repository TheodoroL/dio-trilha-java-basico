//Classe "pai"
public class ServicoMensagemInstancia {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviar Mensagem");
        salvarHistoricoMensagem();
    }
    public  void receberMensagem()
    {
        System.out.println("Recebendo mensagem");

    }
    private void validarConectadoInternet(){
        System.out.println("Valindando se está conectado com a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o hist órico da mensagem");
    }
}

