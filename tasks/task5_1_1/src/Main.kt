// Task 5.1.1: main program

fun main(args: Array<String>) {
    val message = if (anagrams(args[0], args[1])) {
        "They are anagrams."
    } else {
        "They are not anagrams."
    }
    println(message)
}