public class ExemploBreakContinue {
    public static void main(String[] args) {

            useBreak(10);
            System.out.println("----------------------------");
            useContinue(10);
    }
    public  static void useBreak(int count){
        for(int c= 0 ; c < count; c++){
            if(c == 3)
                break;
            System.out.println(c); // vai parar no 2
        }
    }
    public  static  void useContinue(int count){
        for(int c= 0 ; c < count; c++){
            if(c == 3)
                continue;
            System.out.println(c); // vai mostrar todos os valores, menos o valor 3
        }
    }
}
