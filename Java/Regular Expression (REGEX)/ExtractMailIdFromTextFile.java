package RegularExpression;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4) WAP to extract all valid mail id's present in the given text file where mail id's are mixed with normal text data
public class ExtractMailIdFromTextFile {
    public static void main(String[] args) throws IOException {
        String pattern = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
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
