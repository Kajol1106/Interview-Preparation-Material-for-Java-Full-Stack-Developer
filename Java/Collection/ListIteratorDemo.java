package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Kaju");
        list.add("Ram");
        list.add("Sonu");
        list.add("Monu");
        System.out.println(list);   //[Kaju, Ram, Sonu, Monu]

        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()) {
            String str = (String) ltr.next();
            if(str.equals("Sonu")) {
                ltr.remove();
            }
            else if(str.equals("Kaju")) {
                ltr.add("Sagar");
            }
            else if(str.equals("Monu")) {
                ltr.set("Prabhakar");
            }
        }
        System.out.println(list);   //[Kaju, Sagar, Ram, Prabhakar]
    }
}
