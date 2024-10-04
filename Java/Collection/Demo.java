package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.poll();
        System.out.println(deque);
    }
}
