package de.thermondo.solutions.basics

/*
*   Define a function to accept different numbers and return sum of those numbers.
*/

/*
@Suppress("MagicNumber")
fun main() {
    val res = numOfArguments(12, 23, 45, 76, 5, 434, 57, 44, 256, 323)
    println(res)
}*/

fun numOfArguments(vararg data: Int): Int = data.sum()
