// Task 5.3.2: main program

//import kotlin.string.split

fun main(args: Array<String>) {
    val count = args[0].split('d')[0].toInt()
    val sides = args[0].split('d')[1].toInt()
    rollDice(sides=sides, count=count)
}