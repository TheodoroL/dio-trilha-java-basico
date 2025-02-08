public class MSNMessager {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo a mensagem");
    }
    //aplicando o conceito de encapsulamento
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado com a internet");
    }
    private   void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagem");
    }
}
