package HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap m = new HashMap<>();
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(1, "Kaju");
        m.put(2, "Raju");
        m.put(3, "Ram");
        m.put(4, "Divya");
        m.put(5, "Raj");
        m.put(6, "Ajay");
        m.put(1, "Sagar");      //duplicate record replace with old record
        m.put(7, "Kaju");       //duplicate values are allowed

        System.out.println(m);

        System.out.println("Getting specific key value : "+m.get(4));

        m.remove(7);
        System.out.println("After removing specific record : "+m);

        System.out.println("Specific value is present or not : "+m.containsKey(1));    //True
        System.out.println("Specific value is present or not : "+m.containsKey(8));    //False


        System.out.println("Specific value is present or not : "+m.containsValue("Kaju"));    //True
        System.out.println("Specific value is present or not : "+m.containsValue("Y"));    //False

        System.out.println("HashMap is empty or not : "+ m.isEmpty());      //false

        System.out.println("All the keys in set format : "+m.keySet());

        System.out.println("All the values as a Collection : "+m.values());

        System.out.println("All entry as a set object : "+m.entrySet());

        for(Object i:m.keySet()) {  //print all keys individually
            System.out.println(i);
        }

        for(Object i:m.values()) {  //print all values individually
            System.out.println(i);
        }

//        for(Object i:m.keySet()) {  //print all keys value pair individually
//            System.out.println(i + " - "+ m.get(i));
//        }


        //Entry Methods :-
        for(Map.Entry entry:m.entrySet()) {       //all the entry form map
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }


        //traverse using iterator method
        Set s = m.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
             Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}
