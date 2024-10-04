package RegularExpression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNamesPresentInGivenPath {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]txt");
        File f = new File("C:\\Write Or Read Text");
        String[] s = f.list();
        for(String list : s) {
            Matcher m = p.matcher(list);
            if(m.find() && m.group().equals(list)) {
                count++;
                System.out.println(list);
            }
        }
        System.out.println("Total files are : "+ count);
    }
}
