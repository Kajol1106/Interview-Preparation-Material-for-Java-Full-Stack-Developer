package Collection;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(123);
        l.add("Kaju");
        l.add('c');
        l.add(12);

        l.addFirst(78);
        l.addLast(90);
        l.removeFirst();
        l.removeLast();
        System.out.println(l.getFirst());;
        System.out.println(l.getLast());;
        l.set(0, "Ram");
        System.out.println(l);
    }
}
