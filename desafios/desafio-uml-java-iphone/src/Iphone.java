public class Iphone extends  AparelhoTelefonico implements  NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s\n",numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");

    }

    @Override
    public void InciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.printf("Selecionando a música %s\n",musica );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("exibindo a página %s\n", url);
    }
}
