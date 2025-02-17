//se você colocar como final uma classe, nem outra classe pode extender ela
//porém, se eu colocar  non-selead, irei conseguir extender o Employed e também falar que não é possivel extender esas classes
public non-sealed class Salesman extends Employed  {
    private double percentPorSold;

    public double getPercentPorSold() {
        return percentPorSold;
    }

    public void setPercentPorSold(double percentPorSold) {
        this.percentPorSold = percentPorSold;
    }
}
