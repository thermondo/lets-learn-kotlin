package de.thermondo.solutions.basics

import java.lang.Exception

/**
 *
 * Define a function to convert the string if numbers to integers using try as expression
 * and if the string isn't a number it should return an exception.
 *
 *
 * try as expression
 * It works more like if-else in java and when in kotlin.
 *
 * If the condition is true it will execute the try block if not it will return the value from catch.
 */

fun main() {
    var str : String = "456"

    var num : Int = try {
        str.toInt()
    }
    catch (e:Exception){
        0
    }
    println(num)

}
