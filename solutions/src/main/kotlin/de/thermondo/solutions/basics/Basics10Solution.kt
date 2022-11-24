package de.thermondo.solutions.basics

/**
 * Print the table of 2 using while loop.
 */

@Suppress("MagicNumber")
fun basics10Solution() {
    val num = 2
    var index = 1
    val i = 10
    while (index <= i) {
        println(num * index)
        index++
    }
    // print("Current Index : "+index)
}
