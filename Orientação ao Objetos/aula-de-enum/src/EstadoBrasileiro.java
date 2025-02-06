public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "SÃO PAULO"),
    PIAUI("PI", "Piaui"),
    MARANHAO("MA", "Maranhão"),
    MATO_GROSSO("MT", "Mato Grosso"),
    MATO_GROSSO_SUL("MS", "Mato Grosso do Sul"),
    RIO_JANEIRO("RJ", "Rio de Janeiro");

    private String nome;
    private  String sigla;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public  String getNomeMaiusculo(){
        return this.nome.toUpperCase();
    }
    private  EstadoBrasileiro(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

}
