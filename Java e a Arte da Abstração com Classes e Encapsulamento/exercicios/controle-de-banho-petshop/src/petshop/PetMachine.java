package petshop;

public class PetMachine {
    private  boolean clean;
    private int water;
    private  int shampoo;

    private Pet pet;

    public  void takeShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        if(water < 10 && shampoo < 2){
            System.out.printf("É necessário ter no minimo 10 litros e de água e 2 litros de shampoo...\nPorém aqui só tem %d de shampoo e %d água", shampoo, water);
            return;
        }
        this.pet.setClean(true);
        this.water-=10;
        this.shampoo-=2;
        System.out.printf("O pet %s está limpo\n", this.pet.getName());
    }
    public  void addWater(){
        if( this.water >= 30 ){
            System.out.println("A capacidade de água na máquina está no maximo...");
            return;
        }
        this.water+=2;
    }

    public  void addShampoo(){
        if( this.shampoo >= 10 ){
            System.out.println("A capacidade de shampoo na máquina está no maximo...");
            return;
        }
        this.shampoo+=2;
    }

    public boolean hashPet(){
        return this.pet!=null;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setPet(Pet pet) {
        if(hashPet()){
            System.out.printf("O pet %s está na máquina nesse momento\n", this.pet.getName());
            return;
        }

        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        this.pet = pet;
        System.out.printf("O pet %s foi colocado na máquina\n ", this.pet.getName());

    }
    public  void removePet(){
        this.clean = this.pet.isClean();
        if(!pet.isClean()){
            System.out.println("Limpa primeiro o pet");
            return;
        }
        System.out.printf("O pet %s está limpo e foi retirado na máquina\n", this.pet.getName());
        this.pet = null;
        this.clean = false;
    }
    public void wash(){
        if(water < 3&& shampoo < 1){
            System.out.printf("É necessário ter no minimo 10 litros e de água e 2 litros de shampoo...\nPorém aqui só tem %d de shampoo e %d água", shampoo, water);
            return;
        }
        this.water-=3;
        this.shampoo-=1;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
