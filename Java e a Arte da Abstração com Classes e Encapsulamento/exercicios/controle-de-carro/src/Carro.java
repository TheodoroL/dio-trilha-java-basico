public class Carro {

    private boolean carroLigado;
    private  int velocidade;
    private  int trocarMarcha;
    private  String direcao;

    public Carro(){
        this.carroLigado = false;
        this.velocidade = 0;
        this.trocarMarcha = 0;
    }
    public  void ligarCarro(){
        this.carroLigado = true;
        System.out.println("Carro ligado com sucesso!");
    }
    public  void desligarCarro(){
        if(this.velocidade!=0 ||this.trocarMarcha!= 0){
            System.out.println("É necessário que o carro esteja na velocidade 0km e a marcha 0");
            return;
        }
        this.carroLigado = false;
        System.out.println("Carro desligado com sucesso!");
    }

    public void acelerarCarro(){
        if(! this.carroLigado){ System.out.println("O carro está desligado, porfavor ligar o carro para celerar"); return;}

        if(this.trocarMarcha == 0){
            System.out.println("Porfavor, troca a marcha 1 para acelerar");
            return;
        }

        switch (trocarMarcha){
            case 1 ->{
                if(this.velocidade >20){
                    System.out.println("A marcha só vai de 0km até 20km");
                    return;
                }
            }
            case 2 ->{
                if(this.velocidade <21){
                    System.out.println("A marcha só vai de 21km até 40km");
                    return;
                }
                if(this.velocidade >=40){
                    System.out.println("A marcha só vai de 21km até 40km");
                    return;
                }
            }
            case 3 -> {
                if(this.velocidade <41){
                    System.out.println("A marcha só vai de 41km até 60km");
                    return;
                }
                if(this.velocidade >=60){
                    System.out.println("A marcha só vai de 41km até 60km");
                    return;
                }
            }
            case 4 -> {
                if(this.velocidade <61){
                    System.out.println("A marcha só vai de 61km até 80km");
                    return;
                }
                if(this.velocidade >= 80){
                    System.out.println("A marcha só vai de 41km até 80km");
                    return;
                }
            }
            case 5 -> {
                if(this.velocidade < 81){
                    System.out.println("A marcha só vai de 81km até 100km");
                    return;

                }
                if(this.velocidade >=100){
                    System.out.println("A marcha só vai de 81km até 100km");
                    return;
                }
            }
            case 6 ->{
                if(this.velocidade < 101){
                    System.out.println("A marcha só vai de 101km até 120km");
                    return;
                }
                if(this.velocidade >=120){
                    System.out.println("A marcha só vai de 101km até 120km");
                    return;
                }
            }
        }
        this.velocidade++;
        System.out.printf("Acelerando o carro %d\n", this.velocidade);
    }
    public void diminuirVelocidadeCarro(){
        if(! this.carroLigado){ System.out.println("O carro está desligado, porfavor ligar o carro para diminuir a velocidade"); return;}

        if(this.velocidade <=0) {
            System.out.println("Chegou no minimo do carro do carro");
            return;
        }
        this.velocidade--;
        System.out.printf("Diminuindo a velocidade do carro para %d\n", this.velocidade);

    }

    public void direcaoEsquerda(){
        if(! this.carroLigado){ System.out.println("O carro está desligado, porfavor ligar o carro para virar ele para esquerda"); return;}
        if(this.velocidade <1 || this.velocidade >40){
            System.out.println("Não é possivel virar para esquerda, pois você tem que está no minimo 1km e no maximo 40km ");
            return;
        }
        this.direcao = "esquerda";
        System.out.printf("Carro para %s\n",this.direcao);
    }
    public void direcaoDireita(){
        if(! this.carroLigado){ System.out.println("O carro está desligado, porfavor ligar o carro para direita"); return;}
        if(this.velocidade <1 || this.velocidade >40){
            System.out.println("Não é possivel virar para direita, pois você tem que está no minimo 1km e no maximo 40km ");
            return;
        }
        this.direcao = "direita";
        System.out.printf("Carro para %s\n",this.direcao);

    }

    public  void trocarMarcha(){
        if(!this.carroLigado){
            System.out.println("O carro está desligado, porfavor ligar o carro para poder trocar a marcha.");
            return;
        }
        if(this.trocarMarcha >=6){
            System.out.println("O carro só tem 6 marchas");
            return;
        }

        System.out.printf("Saindo da Macha %d\n", this.trocarMarcha);
        this.trocarMarcha++;
    } public  void diminuindoTrocaMarcha(){
        if(!this.carroLigado){
            System.out.println("O carro está desligado, porfavor ligar o carro para poder diminuir a troca marcha.");
            return;
        }
        if(this.trocarMarcha <=0){
            System.out.println("O minimo é zero");
            return;
        }
        System.out.printf("Saindo da Macha %d\n", this.trocarMarcha);
        this.trocarMarcha--;
    }
}
