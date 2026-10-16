// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val string = "Spinx of black quartz; judge my vow."
    println("Vowels: ${string.howMany { it.lowercase() in "aeiou" }}")
    println("Consonants: ${string.howMany { it.lowercase() in "bcdfghjklmnpqrstvwxyz" }}")
}
