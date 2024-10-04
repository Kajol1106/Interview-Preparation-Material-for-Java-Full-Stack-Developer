package String;

import java.util.Scanner;

public class CountCharOccuranceInString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String : ");
//        String str = sc.nextLine();

        String str = "Weclcome to java";
        int length = str.length();  //original length of string
        String ch = "a"; //which character occurance you want to count
        int after_removing_char_length = str.replaceAll(ch, "").length();   //after removing character ch length of string
        int count = length-after_removing_char_length;  //for count character occurance in string
        System.out.println(count);
    }

}
