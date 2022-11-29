package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics18SolutionTest {

    @Test
    fun `Validate the age of the person`() {
        // namedArgs(age= 33)
        assertEquals("My name is xyz and I am 32 years old", namedArgs(age = 32))
    }
}
