package de.thermondo.solutions.basics

/* Create an extension function to swap the numbers in a mutable list. (Using this keyword) */

/*
@Suppress("MagicNumber")
fun main() {
    val list = mutableListOf(12, 34, 45, 32)
    println(list.swap(0, 2))
}*/

fun MutableList<Int>?.swap(first: Int, second: Int): Any {
    if (this == null) {
        return "null"
    } else {
        var temp = this[first]
        this[first] = this[second]
        this[second] = temp
        return this
    }
}
