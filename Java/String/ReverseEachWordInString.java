package String;

import java.util.Scanner;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        //    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter String : ");
//    String str = sc.nextLine();

        String str = "Welcome to Java Programming";     //original string

        /*
        //approach 1
        String[] word = str.split(" ");     //spliting string into words
        String reverse_str = "";       //to store reverse string
        for(String s:word) {
            String reverse_word = "";
            for(int i=s.length()-1; i>=0; i--) {
                reverse_word += s.charAt(i);
            }
            reverse_str += reverse_word+" ";
        }
        System.out.println(reverse_str);

         */



        //approach 2 using built in method
        String[] words = str.split("\\s");
        String reverse_str = "";
        for(String s:words) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            reverse_str += sb.toString()+" ";   //to convert stringbulider object into normal string
        }
        System.out.println(reverse_str);
    }
}
