// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("A Name", LocalDate(2000, 1, 1))
    p.name = ""
}