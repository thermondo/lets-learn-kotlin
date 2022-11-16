package de.thermondo.solutions.basics

/**
 * Enumeration is a named list of constants.
 * In Kotlin, an enum has its own specialized type, indicating that something has a number of possible values.
 * and it's defined by using enum keyword before a class.
 *
 * Define an enum class named Basics6Solution that prints the number of days of the week to the console.
 */

enum class Basics7Solution {
    SUNDAY,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

fun main() {
    Basics7Solution.values().forEach { println(it) }
}

