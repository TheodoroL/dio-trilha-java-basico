public class Main {
    public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setName("Lucas");
    manager.setLogin("lucas");
    manager.setPassword("lucas123456");
    System.out.printf("nome: %s login : %s senha : %s", manager.getName(), manager.getLogin(),manager.getPassword() );
    }
}