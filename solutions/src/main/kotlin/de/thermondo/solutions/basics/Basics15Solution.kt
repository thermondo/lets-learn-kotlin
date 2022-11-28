package de.thermondo.solutions.basics

/**
 *
 * Define a function to convert the string of numbers to integers using try as expression
 * and if the string isn't a number it should return an exception.
 *
 *
 * try as expression - It works more like if-else in java and when in kotlin.
 * If the condition is true it will execute the try block if not it will return the value from catch.
 */

fun main() {
    tryCatch()
}

fun tryCatch(): Int {
    var str: String = "456"

    var num: Int = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println(num)
    return num
}
