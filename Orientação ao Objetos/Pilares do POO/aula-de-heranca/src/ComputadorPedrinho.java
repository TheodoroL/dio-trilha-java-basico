public class ComputadorPedrinho {
    public static void main(String[] args) {
        //"Aplicativos do Pedrinho"
        System.out.println("-------------MSN----------------");
        MSNMessage msn = new MSNMessage();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("-------------Facebook----------------");
        FacebookMessage facebook = new FacebookMessage();
        facebook.enviarMensagem();
        facebook.receberMensagem();
        System.out.println("--------------Telegram-----------------");
        TelegramMessage telegram = new TelegramMessage();
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
