public non-sealed class Salesman extends Employed {
    private double percentPortSold;
    private  double soldAmount;
    public Salesman(String code, String name, String address, int age, double salary, double percentPortSold , double soldAmount) {
        super(code, name, address, age, salary);
        this.soldAmount = soldAmount;
        this.percentPortSold = percentPortSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public Salesman(){

    }

    @Override
   public double getFullSalary() {
        return getSalary() + ((soldAmount*percentPortSold)/100);
    }

    public double getPercentPortSold() {
        return percentPortSold;
    }

    public void setPercentPortSold(double percentPortSold) {
        this.percentPortSold = percentPortSold;
    }
}
