// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry
// copied from week 2 and modified

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    // each side length should be
    // smaller than the sum of the other two side lengths

    // sides
    val (a, b, c) = triangle

    // check
    if (a<b+c && b<a+c && c<a+c) {
        return true
    } else {
        return false
    }
}

fun triangleArea(triangle: Triangle): Double {
    // test validity
    require(isValidTriangle(triangle))

    // sides
    val (a, b, c) = triangle

    // copied from week 1
    // Calculations
    val s = 0.5*(a + b + c)
    val A = sqrt(s*(s-a)*(s-b)*(s-c))

    // Output
    return A
}