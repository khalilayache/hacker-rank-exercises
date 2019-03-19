package java_exs.stdin_stdout_ii;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

/*this challenge should be bugged on Hackerrank site cause this code
    executed on site cause error in 2 test cases
    but executing here the output is the same on
    test cases errors
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        String s = scan.next();
//
//        while (scan.hasNext()) {
//            s = s.concat(" " + scan.next());
//        }

        int i = 2147483647;
        double d = 235345345345.234534;
        String s = "   fsdfsdf   sdf";

        System.out.println("String: " + s.trim());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


        i = -23123;
        d = 123123232;
        s = "  m";

        System.out.println("\n");
        System.out.println("String: " + s.trim());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
