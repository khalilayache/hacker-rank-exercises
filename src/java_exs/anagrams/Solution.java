package java_exs.anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        int[] numLetters = new int[26];

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        for (char letter : a.toCharArray()) {
            numLetters[(int) letter - (int) 'a']++;
        }

        for (char letter : b.toCharArray()) {
            numLetters[(int) letter - (int) 'a']--;
        }

        for (int count : numLetters) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}