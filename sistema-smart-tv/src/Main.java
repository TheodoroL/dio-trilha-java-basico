public class Main {
    public static void main(String[] args) {
        var smartTv = new SmartTv();
        System.out.printf("""
                Tv está ligada ? : %b
                Canal atual ? : %d
                Volume atual ? : %d
                %n""", smartTv.ligada, smartTv.canal, smartTv.volume);
        smartTv.Ligada();
        System.out.println("SmartTv ligada ? : "+ smartTv.ligada);
        smartTv.AumantarVolume();
        smartTv.AumantarVolume();
        smartTv.AumantarVolume();
        smartTv.AumantarVolume();
        System.out.println("Volume da SmartTv  : "+ smartTv.volume);
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        smartTv.DiminuirVolume();
        System.out.println("Volume da SmartTv  : "+ smartTv.volume);
        smartTv.MudarCanal(30);
        System.out.println("Canal atual => "+smartTv.canal);
        smartTv.AumentarCanal();
        smartTv.AumentarCanal();
        smartTv.AumentarCanal();
        smartTv.AumentarCanal();
        smartTv.AumentarCanal();
        System.out.println("Canal atual => "+smartTv.canal);
        smartTv.DiminuirCanal();
        smartTv.DiminuirCanal();
        System.out.println("Canal atual => "+smartTv.canal);

    }
}