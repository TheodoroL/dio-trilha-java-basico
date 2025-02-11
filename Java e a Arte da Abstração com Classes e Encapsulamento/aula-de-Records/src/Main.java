public class Main {
    public static void main(String[] args) {
        var person = new Person("TheodoroL", 19);
        //para ver os valores do person, tem que ser por métodos
        System.out.println(person.name()); // esses métodos são constantes, ou seja, os valores são imutaveis
        System.out.println(person.age());

        System.out.println(person.getInfo());
    }
}