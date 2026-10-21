// Task 12.3.3
// copied 12.3.2
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false

    init {
        require(name.isNotBlacnk()) {"Name cannot be blank"}
    }
}