package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassDemo {
    public static void main(String[] args) {

//        1. [abc] - Either a OR b OR c
//        2. [^abc] - Except a, b and c
//        3. [a-z] - Any lower case alphabet symbol.
//        4. [A-Z] - Any upper case alphabet symbol.
//        5. [a-zA-Z] - Any alphabet symbol.
//        6. [0-9] - Any digit from 0 to 9
//        7. [a-zA-Z0-9] - Any alpha numeric symbol
//        8. [^a-zA-Z0-9] - Except alpha numeric symbol (special characters)

        String pat1 = "[abc]";
        String pat2 = "[^abc]";
        String pat3 = "[a-z]";
        String pat4 = "[A-Z]";
        String pat5 = "[0-9]";
        String pat6 = "[a-zA-Z]";
        String pat7 = "[a-zA-Z0-9]";
        String pat8 = "[^a-zA-Z0-9]";


//                    Pre-defined character classes :-
//                *********************************
//        1. \\s - Space character
//        2. \\S - Any character expect space
//        3. \\d - Any digit from [0-9]
//        4. \\D - Any character expect digit
//        5. \\w - Any word character [any alpha numeric character][a-zA-Z0-9]
//        6. \\W - Except word character (special character)
//        7. . - Any symbol including special character also.

        String s1 = "\\s";
        String s2 = "\\S";
        String s3 = "\\d";
        String s4 = "\\D";
        String s5 = "\\w";
        String s6 = "\\W";
        String s7 = ".";




//                  Quantifiers :-
//                ****************
//
//        - We can use quantifiers to specify number of occurences to match
//        1. a - Exactly one a
//        2. a+ - Atleast one a
//        3. a* - Any number of a's including zero number also
//        4. a? - Atmost one a

        String q1 = "a";
        String q2 = "a+";
        String q3 = "a*";
        String q4 = "a?";



        String target = "a6b TE123@r%6@3";
        String target2 = "abaabaaab";

        /*
        Pattern p = Pattern.compile(pat1);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        /*
        Output :
        0---a
        2---b
         */

        /*
        Pattern p = Pattern.compile(pat2);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        output :-
        1---6
        3---T
        4---E
        5---1
        6---2
        7---3
        8---@
        9---r
        10---%
        11---6
        12---@
        13---3
         */


        /*
        Pattern p = Pattern.compile(pat3);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        output :-
        0---a
        2---b
        9---r
         */

        /*
        Pattern p = Pattern.compile(pat4);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        3---T
        4---E
         */

        /*
        Pattern p = Pattern.compile(pat5);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        1---6
        5---1
        6---2
        7---3
        11---6
        13---3
         */

        /*
        Pattern p = Pattern.compile(pat6);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        2---b
        3---T
        4---E
        9---r
         */


        /*
        Pattern p = Pattern.compile(pat7);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        1---6
        2---b
        3---T
        4---E
        5---1
        6---2
        7---3
        9---r
        11---6
        13---3
         */


        /*
        Pattern p = Pattern.compile(pat8);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        8---@
        10---%
        12---@
         */


        /*
        Pattern p = Pattern.compile(s1);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        3--- (Here space)

         */

        /*
        Pattern p = Pattern.compile(s2);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        1---6
        2---b
        4---T
        5---E
        6---1
        7---2
        8---3
        9---@
        10---r
        11---%
        12---6
        13---@
        14---3

         */


        /*
        Pattern p = Pattern.compile(s3);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        1---6
        6---1
        7---2
        8---3
        12---6
        14---3

         */


        /*
        Pattern p = Pattern.compile(s4);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        2---b
        3---
                4---T
        5---E
        9---@
        10---r
        11---%
        13---@

         */

        /*
        Pattern p = Pattern.compile(s5);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        1---6
        2---b
        4---T
        5---E
        6---1
        7---2
        8---3
        10---r
        12---6
        14---3

         */

        /*
        Pattern p = Pattern.compile(s6);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        3---
                9---@
        11---%
        13---@

         */

        /*
        Pattern p = Pattern.compile(s7);
        Matcher m = p.matcher(target);
        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
        Output :-
        0---a
        1---6
        2---b
        3---
                4---T
        5---E
        6---1
        7---2
        8---3
        9---@
        10---r
        11---%
        12---6
        13---@
        14---3

         */

        /*
        Pattern p = Pattern.compile(q1);
        Matcher m = p.matcher(target2);
        while (m.find()) {
            System.out.println(m.start()+"--"+m.group());
        }

        Output :
        0--a
        2--a
        3--a
        5--a
        6--a
        7--a

         */

        /*
        Pattern p = Pattern.compile(q2);
        Matcher m = p.matcher(target2);
        while (m.find()) {
            System.out.println(m.start()+"--"+m.group());
        }

        Output :
        0--a
        2--aa
        5--aaa

         */


        /*
        Pattern p = Pattern.compile(q3);
        Matcher m = p.matcher(target2);
        while (m.find()) {
            System.out.println(m.start()+"--"+m.group());
        }

        Output :
        0--a
        1-- (sapce)
        2--aa
        4-- (space)
        5--aaa
        8-- (space)
        9-- (space)

         */


        /*
        Pattern p = Pattern.compile(q4);
        Matcher m = p.matcher(target2);
        while (m.find()) {
            System.out.println(m.start()+"--"+m.group());
        }

        Output :
        0--a
        1-- (space)
        2--a
        3--a
        4--(space)
        5--a
        6--a
        7--a
        8--(space)
        9--(space)

         */
    }
}
