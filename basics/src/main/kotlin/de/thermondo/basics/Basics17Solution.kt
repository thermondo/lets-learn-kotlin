package de.thermondo.solutions.basics

/**
 * 3.2 Making functions easier to call
 *
 * Define a function using joinToString.
 *
 */
fun joinAndStringConversion(): String {
    val list = listOf("One", " Two", " Three")

    val value = list.joinToString(
        separator = ";",
        prefix = "(",
        postfix = ")"
        //return value
    )
    println(value)
    return value
}

