package java_exs.string_reverse;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String reverseA = revertWord(A);

        if(A.equals(reverseA)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static String revertWord(String word) {
        StringBuilder reverseWord = new StringBuilder();
        for (int i = word.length() ; i > 0; i--) {
            reverseWord.append(word, i - 1, i);

        }
        return reverseWord.toString();
    }
}