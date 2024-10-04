import java.util.function.Function;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i*i;
        System.out.println("Square of 4 : " + f.apply(4));
        System.out.println("square of 5 : " + f.apply(5));
    }
}
