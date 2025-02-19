public class Ingresso {
    private  String nome;
    private double valor;
    private  String nomeFilme;
    private  String legendadoOuDublado;

    public Ingresso(String nome, double valor, String nomeFilme, String legendadoOuDublado) {
        this.nome = nome;
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.legendadoOuDublado = legendadoOuDublado;
    }
    public Ingresso(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getLegendadoOuDublado() {
        return legendadoOuDublado;
    }

    public void setLegendadoOuDublado(String legendadoOuDublado) {
        this.legendadoOuDublado = legendadoOuDublado;
    }
    public  double real(){
        return getValor();
    }
}
