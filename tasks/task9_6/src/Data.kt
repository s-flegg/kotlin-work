// Task 9.6: readData() function
// coppied from task 7.7.1 and edited

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList {
    Path(filename).forEachLine {
        add(it.toDouble())
    }
}