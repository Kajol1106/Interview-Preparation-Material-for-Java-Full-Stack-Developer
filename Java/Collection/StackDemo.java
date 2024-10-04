package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        for(int i=1; i<=5; i++) {
            s.push(i);
        }
        System.out.println(s);  //[1, 2, 3, 4, 5]

        System.out.println(s.search(3));    //3
        System.out.println(s.search(9));    //-1
    }
}
