package days_of_code_30.day18

import java.util.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val input = scan.nextLine()
        scan.close()

        val s = input.toCharArray()

        val p = Solution()

        for (c in s) {
            p.pushCharacter(c)
            p.enqueueCharacter(c)
        }

        var isPalindrome = true
        for (i in 0 until s.size / 2) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false
                break
            }
        }

        println("The word, " + input + ", is "
                + if (!isPalindrome) "not a palindrome." else "a palindrome.")
    }
}
