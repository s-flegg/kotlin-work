// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Check 3 args are provided and raise an error if not
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    // Convert string args to doubles
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    // Calculations
    val s = 0.5*(a + b + c)
    val A = sqrt(s*(s-a)*(s-b)*(s-c))

    // Output
    println("Area = %.5f".format(A))
}