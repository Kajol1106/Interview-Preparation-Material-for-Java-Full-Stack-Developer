package Collection;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i=1; i<=10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());   //10
        v.addElement('E');
        System.out.println(v.capacity());   //20
        System.out.println(v);
    }
}
