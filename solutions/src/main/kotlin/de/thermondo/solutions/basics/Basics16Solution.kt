package de.thermondo.solutions.basics

/**
 * 3.1 Kotlin Collection
 *
 * Let us create an example using kotlin collections that returns the maximum number from the set and
 * create a list of strings and return the last element from the list.
 *
 */

fun main() {
    val num = setOf<Int>(1, 14, 2, 52)
    println(num.max())

    val list = listOf<String>("Initial", "Middle", "Last")
    println(list.last())

}