package String;

//if u want to print the ASCII value of character in string.

import java.util.Scanner;

public class ReturnASCIIValueOfCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c + "-" + (int)c);
        }
    }

}
