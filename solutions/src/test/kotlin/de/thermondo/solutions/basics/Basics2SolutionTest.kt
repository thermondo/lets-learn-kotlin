package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.Test

class Basics2SolutionTest : BasePrintlnTest() {
    @Test
    fun `Validate helloWorld function`() {
        helloWorld()
        assertPrintln("Hello World!")
    }
}
