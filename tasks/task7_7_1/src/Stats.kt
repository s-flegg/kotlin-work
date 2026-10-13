// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    // sort list
    val sorted = list.sorted()

    // calc midpoint, will be rounded down if float
    val mid: Int = sorted.size / 2

    // Get median
    val median = if (sorted.size % 2 == 0) {
        // in case size is even, mid is the larger of the 2 midpoints
        (sorted[mid] + sorted[mid-1]) / 2
    } else {
        sorted[mid]
    }
    return median
}

fun stats(list: List<Float>) {
    println("""Stats about the list:
        | Min: ${list.min()} 
        | Max: ${list.max()}
        | Sum: ${list.sum()}
        | Average: ${list.average()}
        | Median: ${median(list)}
    """)
}