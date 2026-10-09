// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, count: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var sum = 0
        println("Rolling $count d$sides")
        for (n in 1..count) {
            sum += Random.nextInt(1, sides + 1)
        }
        println("You rolled $sum")
    } else {
        println("Error: cannot have a $sides-sided die")
    }
}