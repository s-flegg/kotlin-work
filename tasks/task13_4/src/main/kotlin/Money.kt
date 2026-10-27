// Task 13.4: Money class
// copied from guide
data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0)
        require(cents >= 0)
        require(cents < 100)
    }
    // copied from guide and edited
    operator fun plus(other: Money) = if (cents + other.cents < 100) Money(euros + other.euros, cents + other.cents) else Money(euros + other.euros + 1, cents + other.cents - 100)
}