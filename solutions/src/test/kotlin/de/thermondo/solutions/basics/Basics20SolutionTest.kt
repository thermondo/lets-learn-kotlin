package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics20SolutionTest {
    val cr = Basics20Solution(4)

    @Test
    fun `Validate the extension function perimeter`() {
        // val cr = Basics20Solution(4)
        assertEquals(25.132741228718345, cr.perimeter())
    }

    @Test
    fun `Validate the area of the circle`() {
        assertEquals(50.26548245743669, cr.area())
    }
}
