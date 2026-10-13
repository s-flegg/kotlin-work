// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    Path(filename).forEachLine {
        val item = it.split(",")
        // and insert them as keys and values into the map
        this[item[0]] = item[1]
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    val path = Path(filename)
    path.writer().use {
        for ((k, v) in this.entries) {
            it.write("$k,$v\n")
        }
    }
}
