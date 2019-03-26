package days_of_code_30.day19

import java.util.*

object Solution {

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val n = scan.nextInt()
        scan.close()

        val myCalculator = Calculator()
        val sum = myCalculator.divisorSum(n)
        println("I implemented: " + myCalculator.javaClass.interfaces[0].name)
        println(sum)
    }
}
