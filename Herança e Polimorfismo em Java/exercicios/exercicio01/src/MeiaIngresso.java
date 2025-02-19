public class MeiaIngresso extends Ingresso{
    public MeiaIngresso(String nome, double valor, String nomeFilme, String legendadoOuDublado) {
        super(nome, valor, nomeFilme, legendadoOuDublado);
    }
    public MeiaIngresso(){

    }

    @Override
    public double real() {
        return getValor()/2;
    }



}
