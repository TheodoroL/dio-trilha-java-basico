import java.time.OffsetDateTime;

public class Person {
    private  final String name;
    private int age;
    // vai pegar o ano atual do seu computador
    private  int lastYearAgeInc = OffsetDateTime.now().getYear();
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  Person(String name){
        this.name = name;
    }

    public void incAge(){
        if(lastYearAgeInc >=  OffsetDateTime.now().getYear()) return;

        this.age+=1;
        lastYearAgeInc = OffsetDateTime.now().getYear();

    }

}
