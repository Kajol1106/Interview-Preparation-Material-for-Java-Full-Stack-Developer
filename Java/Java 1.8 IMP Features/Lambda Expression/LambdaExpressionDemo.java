import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        //if we want to use Interface method then there is need to write implemented class seprately but using lambda expression we can
        //write diretly implementation where u want.
        //Example for threading
        /*
        Runnable inter = ()-> {
            for(int i=0; i<10; i++) {
                System.out.println("Child thread");
            }
        };
        Thread t = new Thread(inter);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main thread");
        }
         */

        /*
        //Example for collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(9);
        list.add(15);
        list.add(9);
        //System.out.println(list);
        Collections.sort(list);
        //System.out.println(list);

        /*
        //if you want to implement your own logic for sorting then we have to use Comparator interface compare method

        int compare(Object obj1, Object obj2) {
            returns -ve if obj1 has to come before obj2;
            returns +ve if obj1 has to come after obj2;
            returns 0 if obj1 and obj2 are equal
        }

         */
        /*
        Comparator<Integer> c = (i1, i2) -> (i1>i2)?-1:(i1<i2)?1:0;
        Collections.sort(list, c);
        System.out.println(list);

        //OR
        Collections.sort(list, (obj1, obj2)-> {
            return obj2-obj1;
        });
        System.out.println(list);
        //we can use aslo below way to print elements
        list.stream().forEach(System.out::println);

         */

        /*

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Kaju", 8000));
        list.add(new Employee(2, "Raju", 7000));
        list.add(new Employee(3, "Faiju", 560009));
        list.add(new Employee(4, "Shaiju", 345678));
        System.out.println(list);
        //for sorting using integer value
        Collections.sort(list, (e1, e2)-> {
            return e2.getEid()-e1.getEid();
        });
        //Collections.sort(list, (e1, e2) ->(e1.getEid()>e2.getEid())? -1 : (e1.getEid()<e2.getEid())? 1: 0);
        System.out.println(list);

        //sorting using string
        Collections.sort(list, (e1, e2)-> e1.getName().compareTo(e2.getName()));
        System.out.println(list);

        //if employees class has emp id and salary then how to find second highest salary based on employee id;

         */

        //instead of taking seprate implement class we can use anonymous class
        //example
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    System.out.println("Child thread ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main thread");
        }
    }

}
