import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> list = List.of(new User("TheodoroL",19),
            new User("Daneo",19),
            new User("Gabriel",19),
            new User("Edu",21)
        );

    //lambda
//    list.forEach(user -> {
//        System.out.println(user.name());
//        System.out.println(user.age());
//    });
//
//    list.forEach(user -> System.out.println(user));
//
//    list.forEach(System.out::println);

        printStringValue(Record::toString,list);
        printStringValue(User::name,list);
        printStringValue(user -> String.valueOf(user.age()),list);
        printStringValue(user -> String.format("%d anos", user.age()),list);
    }

    public static  void printStringValue(Function<User, String> callback, List<User>listUser){
        listUser.forEach(user ->
                System.out.println(
                        callback.apply(user)
                )
        );
    }
}
