package de.thermondo.solutions.basics

/**
 * Define an enum class named Basics8Solution with properties and print the rgb value for a specific color.
 */

enum class Basics08Solution(val r:Int, val g:Int, val b:Int) {
    
    RED(255,0,0),
    ORANGE(255,265,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(75,0,130),
    VIOLET(238,130,238);

    val x = 256
    fun rgb() = (r * x + g) * x + b
}

fun main() {
    println(Basics08Solution.RED.rgb())
    println(Basics08Solution.ORANGE.rgb())
    println(Basics08Solution.YELLOW.rgb())
    println(Basics08Solution.GREEN.rgb())
    println(Basics08Solution.BLUE.rgb())
    println(Basics08Solution.INDIGO.rgb())
    println(Basics08Solution.VIOLET.rgb())
}
