class PlusOne {
    // 210 ms   36.3 MB
    fun bruteForce(digits: IntArray): Array<Int> {
        val reversedDigit = digits.reversed()
        var carry = 1;
        var counter = 0;
        val result = mutableListOf<Int>()
        while (counter < reversedDigit.size || carry > 0) {
            var element = 0
            element = if (counter >= reversedDigit.size)
                carry
            else
                reversedDigit[counter] + carry
            carry = if (element >= 10) {
                result.add(element % 10)
                1
            } else {
                result.add(element)
                0
            }
            counter++
        }
        return result.reversed().toTypedArray()
    }

    // 177 ms  34.7 MB
    fun runTimeFix(digits: IntArray): IntArray {
        var result = digits
        val n = result.size

        for (idx in n - 1 downTo 0) {
            if (result[idx] == 9) {
                result[idx] = 0
            } else {
                result[idx]++
                return result
            }
        }
        result = IntArray(n + 1)
        result[0] = 1
        return result
    }
}