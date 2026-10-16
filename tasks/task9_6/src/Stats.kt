// Task 9.6: variance() function
// copied from guide and edited
fun variance(dataset: List<Double>): Double {
    require(dataset.size >= 2)

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}