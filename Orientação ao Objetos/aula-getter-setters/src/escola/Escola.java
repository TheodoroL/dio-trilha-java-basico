package escola;

public class Escola {
    public static void main(String[] args) {
        var lucas = new Aluno();
        lucas.setNome("Lucas");
        lucas.setIdade(19);

        System.out.printf("O aluno %s tem %d anos\n", lucas.getNome(), lucas.getIdade());
    }
}
