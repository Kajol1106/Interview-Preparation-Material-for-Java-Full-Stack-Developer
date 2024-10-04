package String;

import java.util.Scanner;

public class PrintUppercaseCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.println(c);
            }
        }
    }

}
