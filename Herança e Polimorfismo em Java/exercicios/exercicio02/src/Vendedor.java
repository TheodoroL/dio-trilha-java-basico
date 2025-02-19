public class Vendedor extends Pessoa {
    private  int quantidadeVenda;

    public Vendedor(String nome, String email, String senha, int quantidadeVenda) {
        super(nome, email, senha);
        this.quantidadeVenda = quantidadeVenda;
    }

    public Vendedor() {
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    @Override
    public boolean isAdm() {
        return false;
    }
}
