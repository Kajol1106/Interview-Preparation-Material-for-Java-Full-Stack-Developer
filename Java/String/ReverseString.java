package String;

public class ReverseString {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter String : ");
//    String str = sc.next();

        /*
        //approach 1 - using own logic
        String str = "Hello";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
         */

        /*
        //approach 2 - using built in method
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
         */


        /*
        //approach 3 - using character array
        String str = "Hello";
        String reverse = "";
        char[] c = str.toCharArray();
        for(int i=c.length-1; i>=0; i--) {
            //System.out.print(c[i]);
            //or
            reverse += c[i];
        }
        System.out.println(reverse);
         */


        //approach 4 - using string buffer class
        String str = "hello";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
