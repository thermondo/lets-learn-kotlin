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
    newTryCatch()
}


fun tryCatch(): Int {
    var n1: String = "456"
    //var n2: String = "456"

    var num: Int = try {
        n1.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println(num)
    return num
}

fun newTryCatch(): Int {

    var n2: String = "456a"

    var num2: Int = try {
        n2.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println(num2)
    return num2

}
