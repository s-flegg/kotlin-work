// Task 15.3: program demonstrating dynamic binding
// copied from guide
fun main() {
    val p = Person()
    p.speak()

    val s = Student("Computer Science")
    s.speak()

    val p2: Person = Student("Maths")
    p2.speak()
}
