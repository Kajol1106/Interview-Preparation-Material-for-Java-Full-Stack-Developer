package String;

public class DurgaDemo {
    public static void main(String[] args) {

        //Example for String Constant Pool(SCP) and heap memory area object creation
        String s1 = new String("You cannot change me");
        String s2 = new String("You cannot change me");
        System.out.println(s1==s2); //false

        String s3 = "You cannot change me";
        System.out.println(s1==s3); //false

        String s4 = "You cannot change me";
        System.out.println(s3==s4); //true

        String s5 = "You cannot " +  "change me";
        System.out.println(s4==s5);     //true

        String s6 = "You cannot ";
        String s7 = s6 + "change me";
        System.out.println(s4==s7); //false

        final String s8 = "You cannot ";
        String s9 = s8 + "change me";
        System.out.println(s4==s9);     //true



        /*
        // == VS equals()
        // == always meant for reference comparison
        // equals() is used for content comparison
        String s1 = new String("Kaju");
        String s2 = new String("Kaju");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));  //true

        // == used for reference comparison
        // equals() method used for reference comparison
        StringBuffer sb1 = new StringBuffer("Kaju");
        StringBuffer sb2 = new StringBuffer("Kaju");
        System.out.println(sb1==sb2);   //false
        System.out.println(sb1.equals(sb2));    //false

         */


        /*
        //immutable
        String s = new String("Kajol");
        s.concat(" Kolagir");
        System.out.println(s);  //Kajol
        //if u want to do changes then store the result in another object
        String res = s.concat(" Kolagir");
        System.out.println(res);    //Kajol Kolagir

        //mutable
        StringBuffer str = new StringBuffer("Kajol");
        str.append(" Kolagir");
        System.out.println(str);    //Kajol Kolagir

         */
    }
}
