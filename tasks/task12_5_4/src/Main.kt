// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("name", LocalDate(2000, 1, 2))
    println(p.age)
}