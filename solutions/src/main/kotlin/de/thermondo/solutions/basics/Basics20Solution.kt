package de.thermondo.solutions.basics

/*
*  Create a class Basics20Solution  to calculate the area of the circle and add an extension function to calculate
*  the perimeter of the circle. (Without using 'this' keyword)
*/

class Basics20Solution(val radius: Int) {

    fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun Basics20Solution.perimeter(): Double { // This is the extended
    return 2 * Math.PI * radius
}

/*
@Suppress("MagicNumber")
fun main() {
    val circle = Basics20Solution(4)
    println(circle.perimeter())
    println(circle.area())
}*/
