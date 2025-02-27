package desafios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumero;

    public void exibirNumeros() {
        System.out.println(this.listaNumero);
    }

    public OrdenacaoNumeros() {
        this.listaNumero = new ArrayList<>();
    }

    public  void adicionarNumero(int numero){
        listaNumero.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        if(this.listaNumero.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        List<Integer> listaAscendente = new ArrayList<>(this.listaNumero);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }
    public List<Integer> ordenarDescendente(){
        if(this.listaNumero.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        List<Integer> listDescendente = new ArrayList<>(this.listaNumero);
        Collections.sort(listDescendente, Collections.reverseOrder());
        return listDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}

