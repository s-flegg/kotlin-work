// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    require (args.size == 1) { "Requires filename as command line argument." }
    var result = runCatching {
        val dataStore = readData(args[0])
        println("Variance: ${variance(dataStore)}")
    }
    if (result.isFailure) {
        println("Task failed with an exception: ")
        println(result.exceptionOrNull())
    }
}
