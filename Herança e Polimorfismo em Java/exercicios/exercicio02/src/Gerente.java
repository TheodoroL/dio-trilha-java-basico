public class Gerente extends  Pessoa {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public Gerente() {
    }

    @Override
    public boolean isAdm() {
        return true;
    }
}
