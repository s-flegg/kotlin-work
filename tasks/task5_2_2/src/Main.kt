// Task 5.2.2: conversion of marks into grades, using a function
// copied from guide
fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

// written by me
fun main(args: Array<String>) {
    for (score in args) {
        println("$score is a ${grade(score.toInt())}")
    }
}