public class IngressoFamilia extends  Ingresso {
    private  int quantidadePessoa;
    public IngressoFamilia(String nome, double valor, String nomeFilme, String legendadoOuDublado, int quantidadePessoa) {
        super(nome, valor, nomeFilme, legendadoOuDublado);
        this.quantidadePessoa = quantidadePessoa;
    }

    public IngressoFamilia(){
    }
    @Override
    public double real() {
        double maxReal = getValor()*getQuantidadePessoa();
        if(getQuantidadePessoa() > 3){
            return maxReal - ((maxReal*5)/100);
        }
        return maxReal;
    }

    public int getQuantidadePessoa() {
        return quantidadePessoa;
    }

    public void setQuantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }
}
