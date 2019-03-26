package days_of_code_30.day18

import java.util.*

class Solution {
    private var queue: LinkedList<Char> = LinkedList()
    private var stacky: Stack<Char> = Stack()

    fun enqueueCharacter(c: Char) {
        queue.addLast(c)
    }

    fun dequeueCharacter(): Char {
        return queue.removeAt(0) as Char
    }

    fun pushCharacter(c: Char) {
        stacky.push(c)
    }

    fun popCharacter(): Char {
        return stacky.pop()
    }
}
