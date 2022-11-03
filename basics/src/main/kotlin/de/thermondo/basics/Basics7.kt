package de.thermondo.basics

/**
 *
 * Enumeration is a named list of constants.
 * In Kotlin, an enum has its own specialized type, indicating that something has a number of possible values.
 * and it's defined by using enum keyword before a class.
 */

/**
 * Let's define an enum class that prints the number of days of the week to the console.
 *
 */

fun main() {
 Week.values().forEach { println(it) }
}
enum class Week{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}
