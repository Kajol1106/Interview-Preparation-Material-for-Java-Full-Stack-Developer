package Collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("a");
        h.add("a");
        h.add("i");
        h.add("e");
        h.add("o");
        h.add(null);
        h.add(10);
        System.out.println(h);  //[null, a, e, i, 10, o]
    }
}
