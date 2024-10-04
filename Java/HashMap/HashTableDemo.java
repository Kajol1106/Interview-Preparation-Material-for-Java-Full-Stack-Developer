package HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        //Hashtable t = new Hashtable();      //default capacity is 11, load factor is 0.75
        //Hashtable t = new Hashtable(int initial capcacity);  //we can specify intitial capacity
        //Hashtable t = new Hashtable(int initial capacity, float fill ratio/load factor);

        Hashtable<Integer, String> t = new Hashtable<Integer, String>();
        t.put(1, "Kaju");
        t.put(2, "Raju");
        t.put(3, "Ram");
        t.put(4, "Divya");
        t.put(5, "Vaishu");
        //t.put(null, "x");     //it will get null pointer exception because null values not allowed in key and value also
        //t.put(9, null);       //null pointer exception

        System.out.println(t);

        System.out.println("Getting specific value using key : "+t.get(2));

        t.remove(5);
        System.out.println("After removing print hashtable : " + t);

        System.out.println("Key is present or not : "+t.containsKey(2));    //true
        System.out.println("Key is present or not : "+t.containsKey(9));    //false

        System.out.println("value is present or not : "+t.containsValue("Kaju"));    //true
        System.out.println("value is present or not : "+t.containsValue("Rudra"));    //false

        System.out.println("hashtale is empty or not : "+t.isEmpty());  //false

        System.out.println("all keys from the hashtable : "+t.keySet());
        System.out.println("All the values from the hashtable : "+t.values());

        for(int k:t.keySet()) {
            System.out.println(k + " -- " +t.get(k));
        }

        for(Map.Entry entry:t.entrySet()) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }


        //by using iterator method read data
        Set s = t.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            //System.out.println(itr.next());
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
    }
}
