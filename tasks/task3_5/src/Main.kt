// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val path = Path("test.txt")
    path.writeText("This is a test sentence.")
    println("${path.readText()}")
    path.appendText("This sentence shouldn't overwrite the last one.")
    println("${path.readText()}")
}
