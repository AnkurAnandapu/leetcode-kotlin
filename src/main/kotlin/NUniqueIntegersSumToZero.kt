class NUniqueIntegersSumToZero {
    fun sumZero(n: Int): IntArray {
        val result = IntArray(n)
        var index = 0
        while (index * 2 < n) {
            result[index] = -(index + 1)
            result[n - index - 1] = index + 1
            index++
        }
        return result
    }
}