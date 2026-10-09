// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    // check for correct num of args
    if (args.size != 3) {
        println("Please run with arguments: start-temp end-temp -increment")
        exitProcess(1)
    }
    // read args as Celcius
    // set curr to start temp
    var curr_temp = args[0].toDouble()
    val end_temp = args[1].toDouble()
    val increment = args[2].toDouble()

    // loop
    while (curr_temp <= end_temp) {
        val curr_temp_f = curr_temp * (9.0/5.0) + 32
        println("%4.1f %4.1f".format(curr_temp, curr_temp_f))
        curr_temp += increment
    }
}
