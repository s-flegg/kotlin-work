// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Please provide 3 grades.")
        exitProcess(1)
    }
    // calc avg grade and round to int
    val mark = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat())/3).roundToInt()
    val grade = when (mark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }
    println("${grade}")
}