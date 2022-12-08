package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics26SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validate the split function`() {
        splitFun()
        assertPrintln("[12, 345, 6, A]")
    }
}
