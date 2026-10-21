// Task 12.3.3
// copied from 12.2.2
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("", "2000-01-01") //LocalDate(2000, 1, 1))
    println("${p.name} ${p.birth} ${p.isMarried}")
}