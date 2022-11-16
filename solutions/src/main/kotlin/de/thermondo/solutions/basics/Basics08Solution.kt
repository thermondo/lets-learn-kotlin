package de.thermondo.solutions.basics

/**
 * Define an enum class named Basics8Solution with properties and print the rgb value for a specific color.
 */

enum class Basics8Solution(val r:Int, val g:Int, val b:Int) {
    RED(255,0,0),
    ORANGE(255,265,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(75,0,130),
    VOILET(238,130,238);

    fun rgb() = (r * 256 + g) * 256+ b
}

fun main() {
    println(Basics8Solution.RED.rgb())
    println(Basics8Solution.ORANGE.rgb())
    println(Basics8Solution.YELLOW.rgb())
    println(Basics8Solution.GREEN.rgb())
    println(Basics8Solution.BLUE.rgb())
    println(Basics8Solution.INDIGO.rgb())
    println(Basics8Solution.VOILET.rgb())
}
