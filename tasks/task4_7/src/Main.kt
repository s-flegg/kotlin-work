// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    val filePath = Path(args[0])

    // track longest line
    var longestLine = 1
    var longestLineLength = 0
    var currLine = 1

    // read lines
    filePath.forEachLine {
        if (it.length > longestLineLength) {
            longestLine = currLine
            longestLineLength = it.length
        }
        currLine += 1
    }

    // output
    println("Line ${longestLine} is the longest (length = ${longestLineLength})")
}
