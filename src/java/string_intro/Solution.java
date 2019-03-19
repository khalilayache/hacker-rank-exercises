package java.string_intro;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println((A.length() + B.length()));
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
