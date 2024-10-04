package String;

import java.io.*;
import java.util.Scanner;

public class ReadingDataFromTextFile {
    public static void main(String[] args) throws IOException {
        /*
        //approach 1 - using file reader and buffer reader
        FileReader fr = new FileReader("C:\\Write Or Read Text\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while( (str = br.readLine()) != null) {    //here we are storing br.radline in str
            System.out.println(str);
        }
        br.close();
         */


        /*
        //approach 2 - using scanner and file
        File file = new File("C:\\Write Or Read Text\\test.txt");
        Scanner sc = new Scanner(file);

        //loop statement
        while (sc.hasNextLine()) {  //it will return true
            System.out.println(sc.nextLine());  //if hasnextline is true
        }
         */


        //approach 3 - using scanner and file without using loop
        File file = new File("C:\\Write Or Read Text\\test.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

    }
}
