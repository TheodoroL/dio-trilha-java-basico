package banco.conta;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private  String nome;
    private boolean usandoCheque= false;
    private  String cpf;

    public Conta(String nome, String cpf, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.chequeEspecial = (saldo > 500) ? saldo* 0.5 : 50;

    }
    public  void depocitarDinheiro(double dinheiro){
        if(dinheiro < 0){
            System.out.println("Porfavor, coloca um valor maior que zero na sua conta.");
            return;
        }
        this.saldo+= dinheiro;
    }

    public double limiteConta(){
        return this.saldo+this.chequeEspecial;
    }

    public  double consultarSaldo(){
        return this.saldo;
    }
    public  double consultarChequeEspecial(){
        return this.chequeEspecial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void sacar(double dinheiro){
        if(dinheiro > limiteConta()){
            System.out.println("Não é possivel fazer esse saque...");

        }
        else if(dinheiro <= saldo){
            saldo-=dinheiro;
        }
        else if (dinheiro > saldo){
            this.usandoCheque = true;
            double extra = dinheiro - saldo;
            double taxa  = extra*0.2;
            double total = taxa+extra;
            if (limiteConta() >= dinheiro) {
                this.saldo = 0;
                this.chequeEspecial -= total;
            } else {
                System.out.println("Saldo insuficiente, mesmo com o cheque especial.");
            }
        }
    }
    public void depositar(double dinheiro){
        if(dinheiro <=0){
            System.out.println("coloca um valor maior que zero");
            return;
        }
        if(usandoCheque){
            System.out.println("você usou o cheque especial, então vai ter uma taixa de 20%");
            dinheiro-= dinheiro*0.20;
            this.chequeEspecial= (dinheiro >500) ? (dinheiro*50)/100: 50;
            this.usandoCheque = false;
        }
        this.saldo+=dinheiro;
    }
    public  void pagarBoleto(double dinheiro){
        if(dinheiro <= 0){
            System.out.println("Não é possivel pagar o boleto, pois o valor está menor ou igual a zero");
            return;
        }
        System.out.printf("tentando pagar o boleto de %.2f\n", dinheiro);
        this.sacar(dinheiro);
    }
    public void mostrarInfo(){
        System.out.println("------------------------------");
        System.out.printf("Nome: %10s\n", getNome());
        System.out.printf("cpf: %10s\n", getCpf());
        System.out.printf("saldo: %10.2f\n", consultarSaldo());
        System.out.printf("cheque especial: %10.2f\n", consultarChequeEspecial());
        System.out.printf("Usando cheque especial: %10s\n", (usandoCheque? "Sim":"Não"));
        System.out.println("------------------------------");

    }
}
