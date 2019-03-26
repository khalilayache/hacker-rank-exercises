package days_of_code_30.day19

internal class Calculator : AdvancedArithmetic {
    override fun divisorSum(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (n % i == 0) {
                sum += i
            }
        }
        return sum
    }
}
