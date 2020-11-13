import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for ((index, value) in nums.iterator().withIndex()) {
            if (map.containsKey(target - value)) {
                return intArrayOf(map[target - value]!!, index)
            }
            map.put(value, index)
        }
        return intArrayOf(0, 1)
    }

    @Test
    fun helloWorldReturnsPersonalizedMessage() {
        assertEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}