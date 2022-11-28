package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics15SolutionTest {

    @Test
    fun `Validate the integers`() {
        assertEquals(456, tryCatch())
    }

    @Test
    fun `Validate the exception`(){
    assertEquals(0, newTryCatch())
    }

}
