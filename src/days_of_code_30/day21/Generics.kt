package days_of_code_30.day21

import java.util.*

object Generics {

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        var n = scanner.nextInt()
        val intArray = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            intArray[i] = scanner.nextInt()
        }

        n = scanner.nextInt()
        val stringArray = arrayOfNulls<String>(n)
        for (i in 0 until n) {
            stringArray[i] = scanner.next()
        }

        val intPrinter = Printer<Int>()
        val stringPrinter = Printer<String>()
        intPrinter.printArray(intArray)
        stringPrinter.printArray(stringArray)
        if (Printer::class.java!!.getDeclaredMethods().size > 1) {
            println("The Printer class should only have 1 method named printArray.")
        }
    }
}