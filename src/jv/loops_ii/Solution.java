package jv.loops_ii;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int s = a;
            for (int j = 0; j < n; j++) {
                s  = s + (int) (Math.pow(2, j)) * b;
                System.out.print(s + " ");
            }
        }
    }
}
