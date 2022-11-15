package de.thermondo.solutions.basics

/**
 * Print the table of 2 using while loop.
 */

fun main() {
    var num = 2
    var index = 1
    while (index <= 10)
    {
        println(num*index)
        index++
    }

    print("Current Index : "+index)
}
