// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA<sideB+sideC && sideB<sideA+sideC && sideC<sideA+sideB)
    }

    val perimeter: Double = sideA + sideB + sideC
    val semiPerimeter: Double = perimeter / 2
    val area: Double = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}