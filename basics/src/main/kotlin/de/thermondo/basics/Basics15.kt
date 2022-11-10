package de.thermondo.basics

import java.lang.Exception

/**
 *
 * try as expression
 * It works more like if-else in java and when in kotlin.
 *
 * If the condition is true it will execute the try block if not it will return the value from catch.
 */

fun main() {
    var str : String = "4a"

    var num : Int = try {
        str.toInt()
    }
    catch (e:Exception){
        0
    }
    println(num)

}
