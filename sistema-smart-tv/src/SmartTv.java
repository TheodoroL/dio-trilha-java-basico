public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void Ligada(){
        this.ligada = true;
    }
    public void Desligar(){
        this.ligada = false;
    }
    public  void MudarCanal(int canal){
        this.canal = canal;
    }
    public void AumentarCanal(){
        this.canal++;
    }
    public void DiminuirCanal(){
        this.canal--;
    }
    public  void AumantarVolume(){
        if(this.volume >= 100){
            System.out.println("Não é possivel aumentar o volume");
            return;
        }
        this.volume++;
    }
    public void DiminuirVolume(){
        if(this.volume <= 0){
            System.out.println("Não é possivel aumentar o volume");
            return;
        }
        this.volume--;
    }
}
