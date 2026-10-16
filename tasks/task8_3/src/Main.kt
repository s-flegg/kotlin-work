// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val dataset = fetchData(args[0])
    val lowest = dataset.minBy { it.second }
    val highest = dataset.maxBy { it.second }
    println(lowest)
    println(highest)

    println("Average temp: ${averageTemp(dataset)}")
    println("Average temp: ${dataset.sumOf {it.second} / dataset.size}")
}
