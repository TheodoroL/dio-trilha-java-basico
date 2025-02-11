// quando é Record, você declara os atributos aqui
public record Person(String name, int age) {
    //esse construtor ele chama de construtor compacto
    public Person{
        System.out.println("=================");
        System.out.printf("%10s %d\n",name, age);
        System.out.println("=================");
    }

    //posso fazer mais de um construtor
    public  Person(String name){
        this(name, 1);
    }

    // criar métodos

    public String  getInfo(){
        return String.format("Name %s Age %d", name, age);
    }
}
