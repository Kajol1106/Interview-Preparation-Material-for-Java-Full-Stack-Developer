package Collection;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(78);
        list1.add(3);
        list1.add(null); //we can insert null value also

        ArrayList<Integer> list = new ArrayList<>();
        //add method
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(90);
        list.add(1);

        //addAll Method
        list.addAll(list1);
        System.out.println(list);

        //size()
        System.out.println(list.size());

        //remove
        list.remove(5); //passing object
        System.out.println(list);

        list.remove(1); //passing index
        System.out.println(list);

        //add object on specific position : add(int index, Object o)
        list.add(3, 89);
        System.out.println(list);

        //retrive specific element
        System.out.println(list.get(4));

        //update specific value with new object or replace the object
        list.set(1, 100);
        System.out.println(list);

        //value or object is present or not
        System.out.println(list.contains(34)); //it will return true or false

        //list is empty or not
        System.out.println(list.isEmpty()); //it will return true or false

        //print data
        //1) for loop
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2) for...each loop
        for(Object i: list) {
            System.out.println(i);
        }

        //3) Iterator
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        //remove
        list.removeAll(list1);
        System.out.println(list);

        //sort increasing order
        Collections.sort(list);
        System.out.println(list);

        //sort desending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //shuffling
        Collections.shuffle(list);
        System.out.println(list);

        int[] arr = {1, 6, 4, 3};
        ArrayList demo = new ArrayList(Arrays.asList(arr));
        System.out.println(demo);



    }

}
