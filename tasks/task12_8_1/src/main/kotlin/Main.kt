// Task 12.8.1: demo program for Day enum class

fun main() {
    try {
        println("Please enter a day: ")
        val day = Day.valueOf(readln())
        println(day)
    }
    catch (error: IllegalArgumentException) {
        println("Please enter one of ${Day.entries}")
    }
}