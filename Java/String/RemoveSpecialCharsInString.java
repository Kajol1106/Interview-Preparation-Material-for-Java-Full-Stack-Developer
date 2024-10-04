package String;

import java.util.Scanner;

public class RemoveSpecialCharsInString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String str = sc.nextLine();

        String str = "@#$%^&* Java Programming 0987654321";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
