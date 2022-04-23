class RemoveDuplicates {
    fun bruteForce(nums: IntArray): Int {
        val result = nums.distinct()
        for (i in result.indices) {
            nums[i] = result[i]
        }
        return result.size
    }

    fun leetCodeAnswer(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) return 0
        var insertIndex = 1
        for (i in 1..(n - 1)) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i]
                insertIndex++
            }
        }
        return insertIndex
    }
}