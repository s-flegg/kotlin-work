// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person.create("Name", LocalDate(2000, 1, 1))
    val p2 = Person.create("Name", LocalDate(2001, 1, 1))
}