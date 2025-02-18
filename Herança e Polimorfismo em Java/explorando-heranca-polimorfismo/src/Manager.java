public non-sealed class Manager extends Employed{
    private String login;
    private  String password;
    private  double commision;

    public Manager(String code, String name, String address, int age, double salary, double commision) {
        super(code, name, address, age, salary);
        this.commision = commision;

    }
    public  Manager(){

    }

    @Override
    public double getFullSalary() {
        return this.getSalary()+getCommision();
    }

    //sobrecarga de métodos
    public  double getFullSalary(double extra){
        return  getSalary()+extra;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }
}
