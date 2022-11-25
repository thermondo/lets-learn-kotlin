package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics12SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validate increment function`() {
        increment()
        assertPrintln("1\n2\n3\n4\n5")
    }

    @Test
    fun `Validate stepIncrement function`() {
        stepIncrement()
        assertPrintln("1\n3\n5")
    }

    @Test
    fun `Validate untilIncrement function`() {
        untilIncrement()
        assertPrintln("1\n2\n3\n4")
    }

    @Test
    fun `Validate stepDecrement function`() {
        stepDecrement()
        assertPrintln("10\n8\n6\n4\n2")
    }
}
