// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(1.0, 2.0)
    // p.x = 1.0
    println("x: ${p.x} \ny: ${p.y}")
    println("Distance from origin: ${p.distance()}")

    val p2 = Point(4.5, 7.0)
    println("Distance between points: ${p.distanceTo(p2)}")
}
