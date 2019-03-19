package java_exs.substring_comparison;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-compare/problem

public class Solution {

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            String actualSubString = s.substring(i, i + k);
            if (smallest.compareTo(actualSubString) > 0) {
                smallest = actualSubString;
            }

            if (largest.compareTo(actualSubString) < 0) {
                largest = actualSubString;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
