public class SistemaCadastro {
    public static void main(String[] args) {
        var lucas = new Pessoa("Lucas", "123456789");
        lucas.setEndereco("Teste Endereço");
        System.out.printf("nome: %s\ncpf: %s\nendereço: %s\n", lucas.getNome(), lucas.getCpf(), lucas.getEndereco());
    }
}
