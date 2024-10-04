package RegularExpression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitMethodDemo {
    public static void main(String[] args) {
    /*
        Pattern p = Pattern.compile("\\s");
        String[] str = p.split("Kajol Kolagir Pune Maharashtra");
        for(String s : str) {
            System.out.println(s);
        }

        Output :
        Kajol
        Kolagir
        Pune
        Maharashtra
        */

        /*
        //except a
        Pattern p = Pattern.compile("a");
        String[] str = p.split("Kajol Kolagir Pune Maharashtra");
        for(String s : str) {
            System.out.println(s);
        }
        Output :
        K
        jol Kol
        gir Pune M
        h
        r
        shtr

         */

        /*
        // "." dot means except every character.
        Pattern p = Pattern.compile("\\."); //for dot spliting use \\. or [.]
        String[] str = p.split("www.masai.com");
        for(String s : str) {
            System.out.println(s);
        }
//        Output :
//        www
//        masai
//        com

         */


        /*
        //using string class
        String str = "Kajol Prabhakr Kolagir";
        String[] s = str.split("\\s");
        for(String st : s) {
            System.out.println(st);
        }
        Output :
        Kajol
        Prabhakr
        Kolagir

         */


        /*
        Note : the default regular expressiong of stringTokenizer is space .

        String str = "Kajol Prabhakr Kolagir";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        Otuput :
        Kajol
        Prabhakr
        Kolagir

         */

        String str = "11-06-2000";
        StringTokenizer st = new StringTokenizer(str, "-");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
//        Output :
//        11
//        06
//        2000


    }
}
