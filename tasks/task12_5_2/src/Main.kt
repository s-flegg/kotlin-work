// Task 12.5.2: demo program for class with custom getter

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("test name", LocalDate(2000, 1, 1))
    println(p.name)
}