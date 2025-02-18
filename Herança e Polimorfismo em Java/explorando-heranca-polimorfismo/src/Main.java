public class Main {
    public static void main(String[] args) {
        printEmployed(new Manager(), "Duck");
        printEmployed(new Salesman(), "Daneo");
    }

    public  static void printEmployed (Employed employed, String name){
        //um operador. Compara o tipo de uma variável a uma classe
        System.out.println(employed instanceof  Manager ? "Manager": employed instanceof Salesman ? "Salesman":"Classe desconhecida");

        //pegar o nomo da classe
        System.out.printf("------------%s-------------\n", employed.getClass().getCanonicalName());
        //verifica qual classe que é
        switch (employed){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName(name);
                manager.setSalary(10000);
                manager.setLogin(name);
                manager.setPassword("qwddqfoqhfqiuuhrbdqq");
                manager.setCommision(3000);
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommision());
            }
            case Salesman salesman -> {
                salesman.setCode("321");
                salesman.setName(name);
                salesman.setSalary(1500);
                salesman.setPercentPortSold(15);
                salesman.setSoldAmount(1000);
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPortSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employed.getFullSalary());
    }
}