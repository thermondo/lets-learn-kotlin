package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics14SolutionTest {

    @Test
    fun `Validate the count function`() {
        count(5)
        assertEquals(5, count(5))
    }
}
