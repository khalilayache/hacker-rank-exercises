package jv.static_init;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-static-initializer-block/problem

public class Solution {

    private static int H;
    private static int B;
    private static boolean flag;
    private static Scanner scanner = new Scanner(System.in);

    static {
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = false;

        try {
            if (B >= 1 && H >= 1) {
                flag = true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
