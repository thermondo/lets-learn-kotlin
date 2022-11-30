package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics22SolutionTest {

    @Test
    fun `Validate the character of the string`() {
        assertEquals("t", "kotlin".findChar(2).toString())
    }
}
