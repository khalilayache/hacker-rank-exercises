package java.output_formatting;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-output-formatting/problem

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            for(int j =  s1.length() ; j < 15 ; j++){
                s1 = s1.concat(" ");
            }
            System.out.println(s1 + String.format("%03d", x));
        }
        System.out.println("================================");
    }
}
