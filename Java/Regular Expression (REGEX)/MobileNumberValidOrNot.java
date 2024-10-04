package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidOrNot {
    public static void main(String[] args) {
        String pattern = "(0|91)?[7-9][0-9]{9}";
        String target_num = "7620716665";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(target_num);
        if(m.find() && m.group().equals(target_num)) {
            System.out.println("Valid mobile number...");
        }
        else {
            System.out.println("invalid mobile number...");
        }
    }
}
