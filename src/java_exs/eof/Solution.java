package java_exs.eof;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-end-of-file/problem

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) return;
            System.out.println(n + " " + s);
            n++;
        }

    }
}
