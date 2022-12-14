package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.Test

class Basics03SolutionTest : BasePrintlnTest() {
    @Test
    fun `Validate helloParameter function`() {
        val kotlin = "Kotlin"
        helloParameter(value = kotlin)
        assertPrintln("Hello $kotlin!")
    }
}
