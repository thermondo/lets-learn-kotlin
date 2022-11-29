package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics19SolutionTest {

    @Test
    fun `Validate the default arguments`() {
        assertEquals(
            "My name is Mike Ross, I am 28 years old, Likes Movies: false, Loves Popcorn: true",
            defaultArgs(name = "Mike Ross", age = 28, likesMovies = false)
        )
    }
}
