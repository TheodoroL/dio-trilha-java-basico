package apps;

//aplicando abstração na classe pai
public abstract class ServicoMensagemInstancia {
    public abstract void enviarMensagem();

    public abstract  void receberMensagem();

    //apenas filhos ou do mesmo pacote pode ver esse método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado com a internet");
    }
}

