package de.thermondo.basics

/**
 *
 * Define an enum class with properties.
 *
 * Let's define an enum class to print the rgb value for a specific color.
 */

fun main() {
    println(Color.Green.rgb())
}
enum class Color(val r:Int, val g:Int, val b:Int){
    Red(255,0,0),
    Orange(255,265,0),
    Yellow(255,255,0),
    Green(0,255,0),
    Blue(0,0,255),
    Indigo(75,0,130),
    Violet(238,130,238);

    fun rgb() = (r * 256 + g) * 256+ b
}
