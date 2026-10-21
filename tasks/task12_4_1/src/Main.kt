// Task 12.4.1: main program
fun main() {
    val p = Point(3.0, 4.0)
    val c = Circle(p, 5.0)

    println("Area: ${c.area()}")
    println("Perimeter: ${c.perimeter()}")
    val p2 = Point(4.0, 5.0)
    println(c contains p2)


}