//se você colocar como final uma classe, nem outra classe pode extender ela
//Non-Sealed Classes são classes que não possuem a palavra-chave sealed declarada. Essas classes podem ser herdadas por outras classes e podem ter subclasses. É o comportamento padrão em Java.
//Sealed Classes, por outro lado, são classes que possuem a palavra-chave sealed declarada. Essas classes podem ter subclasses, mas essas subclasses devem ser declaradas explicitamente na classe pai. Isso significa que você não pode criar subclasses de uma classe sealed sem declará-las explicitamente.

public non-sealed class Salesman extends Employed  {
    private double percentPorSold;

    public double getPercentPorSold() {
        return percentPorSold;
    }

    public void setPercentPorSold(double percentPorSold) {
        this.percentPorSold = percentPorSold;
    }
}
