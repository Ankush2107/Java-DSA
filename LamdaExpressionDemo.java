
import java.util.function.Consumer;

public class LamdaExpressionDemo {
    public static void main(String[] args) {
    //   Predicate<Integer> isEven = n ->  n % 2 == 1;
    //   System.out.println(isEven.test(12));
    //   System.out.println(isEven.test(11));


        Consumer<String> print = message -> System.out.println(message);

        print.accept("Hello, ANKUSH");
        print.accept("Hello, RASHMI");
    }
}
