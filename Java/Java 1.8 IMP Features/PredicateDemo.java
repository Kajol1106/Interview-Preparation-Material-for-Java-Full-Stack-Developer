import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i%2==0;
        System.out.println("Number is even or not = "+p.test(4));
    }
}
