// Task 5.1.1: anagrams() function
// copied from guide then modified

infix fun String.anagramOf(str: String): Boolean = this.length == str.length && this.lowercase().toList().sorted() == str.lowercase().toList().sorted()