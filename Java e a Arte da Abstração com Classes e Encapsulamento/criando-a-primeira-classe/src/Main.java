public class Main {
    public static void main(String[] args) {
        var male = new Person("Lucas");
        male.setAge(19);
        male.incAge();
        var female = new Person("Rafaela",17);
//        female.setName("Rafaela");
//        female.setAge(17);
        female.incAge();
        System.out.printf("Male name: %s and Age Male %d\n", male.getName(),male.getAge());
        System.out.printf("Female name: %s and Age Female %d\n", female.getName(),female.getAge());

    }
}