package RegularExpression;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3) WAP to extract all valid mobile numbers present in the given txt file where numbers are mixed with normal text data?
public class ExtractMobileNumberFromTextFile {
    public static void main(String[] args) throws IOException {
        String pattern = "(0|91)?[7-9][0-9]{9}";
        PrintWriter out = new PrintWriter("output.txt");
        Pattern p = Pattern.compile(pattern);
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        while(line != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                out.println(m.group());
            }
            line = br.readLine();
        }
        out.flush();
    }
}
