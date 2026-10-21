// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("guy", "2000-01-01") //LocalDate(2000, 1, 1))
    println("${p.name} ${p.birth} ${p.isMarried}")
}