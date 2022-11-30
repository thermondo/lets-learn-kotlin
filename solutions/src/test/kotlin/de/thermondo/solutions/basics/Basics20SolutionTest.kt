package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics20SolutionTest {

    @Test
    fun `Validate the extension function perimeter`() {
        val cr = Basics20Solution(4)
        assertEquals(25.132741228718345, cr.perimeter())
    }
}
