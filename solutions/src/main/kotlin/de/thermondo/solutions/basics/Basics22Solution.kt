package de.thermondo.solutions.basics

/* Create an extension function with teh library class String and print the character at the position number 2.
*/

fun String.findChar(index: Int): Char = this[index] // 'this' represents the current object for example, this means String here.

/*
fun main() {
    println("kotlin".findChar(2))
}
*/
