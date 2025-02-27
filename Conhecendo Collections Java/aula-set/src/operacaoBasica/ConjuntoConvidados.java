package operacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidado;

    public ConjuntoConvidados() {
        this.listaConvidado = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidado.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
         Convidado convidadoRemover = null;
        if(this.listaConvidado.isEmpty()){
            System.out.println("A lista de convidado está vazia");
            return;
        }

         for(var l : this.listaConvidado) {
             if (l.equals(codigoConvite)) {
                 convidadoRemover = l;
                 break;
             }
         }
         this.listaConvidado.remove(convidadoRemover);
    }

    public  int contarConvidados(){
        return this.listaConvidado.size();
    }
    public  void exibirConvidados(){
        for(var l : this.listaConvidado){
            System.out.println(l);
        }
    }

}
