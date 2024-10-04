package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class RegEXDemo {
    public static void main(String[] args) {
        int count = 0;
        String str = "ababbbab";    //target string
        String patt = "ab";         //which pattern u want to search

        Pattern p = Pattern.compile(patt);  //create pattern object
        Matcher m = p.matcher(str);     //create matcher object. Here matcher method is a pattern class
        while (m.find()) {
            count++;
            System.out.println("Pattern matching start from index : " + m.start());
            System.out.println("Pattern matching end on index : " + m.end());
            System.out.println("which thing got matched : " + m.group());
        }
        System.out.println("Pattern matching count : "+ count);
    }
}
