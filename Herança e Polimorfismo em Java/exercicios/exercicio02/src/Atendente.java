public class Atendente extends Pessoa  {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha, double valorCaixa) {
        super(nome, email, senha);
        this.valorCaixa = valorCaixa;
    }
    public Atendente(){

    }


    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa+= valorCaixa;
    }

    @Override
    public boolean isAdm() {
        return false;
    }
}
