package de.thermondo.basics

import java.lang.Exception

/**
 *
 * try as expression
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
