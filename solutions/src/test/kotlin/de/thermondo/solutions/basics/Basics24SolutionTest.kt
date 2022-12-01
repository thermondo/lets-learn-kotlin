package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics24SolutionTest {

    @Test
    fun `Validate the sum of the infix function`() {
        assertEquals(30, add(10, 20))
    }
}
