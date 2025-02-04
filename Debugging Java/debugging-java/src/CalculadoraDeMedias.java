import java.util.Scanner;
public class CalculadoraDeMedias {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        double media = calcularMediaDaTurma(alunos, scanner);
        System.out.printf("Média da turma %.1f", media);
    }
    public  static  double calcularMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(var aluno : alunos){
            System.out.printf("Digite a nota do aluno %s:", aluno);
            double nota = scanner.nextDouble();
            soma+=nota;
        }
        return soma / alunos.length;
    }
}
