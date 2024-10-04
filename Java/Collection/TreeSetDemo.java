package Collection;

import java.util.TreeSet;

public class TreeSetDemo{
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); //-25
        System.out.println("Z".compareTo("B")); //24
        System.out.println("A".compareTo("A")); //0
        System.out.println("A".compareTo(null));    //NullPointerException

    }
}
