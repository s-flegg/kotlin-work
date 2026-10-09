// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    // check args
    if (args.size != 1) {
        println("Please provide a number to sum to.")
        exitProcess(1)
    }
    // convert args
    val end = args[0].toInt()
    // setup sum. Long to prevent overflow
    var sum: Long = 0
    // step 2 to skip evens
    for (n in 1..end step 2) {
        sum += n
    }
    println("${sum}")
}
