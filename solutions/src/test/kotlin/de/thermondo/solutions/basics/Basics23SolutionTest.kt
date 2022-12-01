package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics23SolutionTest {

    @Test
    fun `validate the sum of num of arguments`() {
        assertEquals(1275, numOfArguments(12, 23, 45, 76, 5, 434, 57, 44, 256, 323))
    }
}
