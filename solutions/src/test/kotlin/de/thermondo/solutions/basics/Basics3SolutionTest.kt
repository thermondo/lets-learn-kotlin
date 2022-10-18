package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.Test

class Basics3SolutionTest : BasePrintlnTest() {
    @Test
    fun `Validate helloWorld function`() {
        val kotlin = "Kotlin"
        helloParameter(value = kotlin)
        assertPrintln("Hello $kotlin!")
    }
}
