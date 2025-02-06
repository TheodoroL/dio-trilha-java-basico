package lanchonete.atendimento.cozinha;


public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche no balcão");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparar o Lanche tipo hamburguer");
    }

    private void preparVitamina(){
        System.out.println("Preparando a suco");
    }
    private void prepararCombo(){
        prepararLanche();
        preparVitamina();
    }

    private void selecionarIgredientesLanhe(){
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }
    private void baterVitaminaLiquitificador(){
        System.out.println("Batendo a vitamina no liquitificador");
    }
    private void selecionarIgredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco");
    }
    private void lavarIgredientes(){
        System.out.println("Lavando Igredientes");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIgredientes(Almoxarife meuAmigo){
        meuAmigo.entregarIgredientes();
    }
}
