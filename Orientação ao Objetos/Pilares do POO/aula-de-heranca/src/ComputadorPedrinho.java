import apps.FacebookMessage;
import apps.MSNMessage;
import apps.ServicoMensagemInstancia;
import apps.TelegramMessage;
import  java.util.Scanner;
public class ComputadorPedrinho {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        ServicoMensagemInstancia msi;
        //"Aplicativos do Pedrinho"
        System.out.print("digite o app que você quer acessar:");
        String app = scanner.nextLine().toLowerCase().replace(" ", "");
        switch (app) {
            case "telegram" -> {
                msi = new TelegramMessage();
                msi.enviarMensagem();
                msi.receberMensagem();
            }
            case "facebook" -> {
                msi = new FacebookMessage();
                msi.enviarMensagem();
                msi.receberMensagem();
            }
            case "msn" -> {
                msi = new MSNMessage();
                msi.enviarMensagem();
                msi.receberMensagem();
            }
            default -> System.out.println("App não encontrado");
        }
        scanner.close();
    }
}
