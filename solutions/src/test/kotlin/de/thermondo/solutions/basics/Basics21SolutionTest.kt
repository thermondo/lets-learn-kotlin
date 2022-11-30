package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics21SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validate the swapped mutable list`() {
        val li1 = mutableListOf<Int>(45, 34, 12, 32)
        val li = mutableListOf(12, 34, 45, 32)
        assertEquals(li1, li.swap(0, 2))
    }
}
