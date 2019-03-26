package days_of_code_30.day20

import java.util.*

object Solution {

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val n = input.nextInt()
        val a = IntArray(n)
        for (a_i in 0 until n) {
            a[a_i] = input.nextInt()
        }

        var numberOfSwaps = 0
        for (i in 0 until n) {

            for (j in 0 until n - 1) {
                if (a[j] > a[j + 1]) {
                    val aux = a[j + 1]
                    a[j + 1] = a[j]
                    a[j] = aux

                    numberOfSwaps++
                }
            }

            if (numberOfSwaps == 0) {
                break
            }
        }
        println("Array is sorted in " + numberOfSwaps + " swaps." +
                "\nFirst Element: " + a[0] +
                "\nLast Element: " + a[n - 1])
    }
}
