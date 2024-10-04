package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdValidOrNot {
    public static void main(String[] args) {
        String pattern = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)";
        String target = "kaju@gmail.com";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(target);
        if(m.find() && m.group().equals(target)) {
            System.out.println("Valid mail id...");
        }
        else {
            System.out.println("invalid mail id...");
        }
    }
}
