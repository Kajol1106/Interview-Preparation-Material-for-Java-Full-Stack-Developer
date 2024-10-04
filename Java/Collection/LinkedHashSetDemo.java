package Collection;


import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("a");
        h.add("a");
        h.add("i");
        h.add("e");
        h.add("o");
        h.add(null);
        h.add(10);
        System.out.println(h);  //[a, i, e, o, null, 10]
    }
}
