package algorithms.mini_max_sum;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/mini-max-sum/problem

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long min;
        long max = 0;

        for (int i : arr) {
            if (max > i) {
                max = i;
            }

            sum += i;
        }

        min = sum;

        for (
                int i : arr) {
            if (max < sum - i) {
                max = sum - i;
            }

            if (min > sum - i) {
                min = sum - i;
            }
        }

        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
