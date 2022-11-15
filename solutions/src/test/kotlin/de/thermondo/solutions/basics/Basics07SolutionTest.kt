package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test


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


class Basics07SolutionTest{
    private val dayOfWeek: String = Basics7Solution()

    @Test
    fun `Validate the day of the week`(){
        kotlin.test.assertEquals(expected = "Sunday", actual = dayOfWeek)
    }

}




