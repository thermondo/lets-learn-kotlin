package de.thermondo.solutions.basics

/*
*   Define an infix to perform the addition.
*/

/*
@Suppress("MagicNumber")
fun main() {
    var x = 10.add(20)
    println(x)
} */

infix fun Int.add(b: Int) = this + b
