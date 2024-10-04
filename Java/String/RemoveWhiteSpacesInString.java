package String;

import java.util.Scanner;

public class RemoveWhiteSpacesInString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String str = sc.nextLine();

        String str = "Welcome   To    Java";
        //str = str.replaceAll(" ", "");
        //or
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
