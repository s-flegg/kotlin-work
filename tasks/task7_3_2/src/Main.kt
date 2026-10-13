// copied from 7.3.1 and edited

fun main() {
    val nums =  mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    nums.add(1)
    println(nums)
    println(nums[0])
    println(nums.slice(2..4))
    println(nums.first())
    println(nums.last())
    nums[0] = 10
    println(nums)
}