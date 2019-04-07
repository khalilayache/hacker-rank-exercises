package algorithms.plus_minus;

import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
   private static void plusMinus(int[] arr) {
        double pos = 0;
        double neg = 0;
        double zer = 0;

        for (int value : arr) {
            if (value > 0) {
                pos++;
            }
            if (value < 0) {
                neg++;
            }
            if (value == 0) {
                zer++;
            }
        }

        System.out.println(String.format("%.6f",(pos/arr.length)*1.0));
        System.out.println(String.format("%.6f",(neg/arr.length)*1.0));
        System.out.println(String.format("%.6f",(zer/arr.length)*1.0));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}



