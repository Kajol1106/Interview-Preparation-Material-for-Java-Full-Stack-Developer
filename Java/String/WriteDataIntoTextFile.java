package String;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Write Or Read Text\\test.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("I am kajol kolagir.");
        bw.write("From Pune, Maharashtra");
        bw.close();

        System.out.println("Writing is finished....");
    }
}
