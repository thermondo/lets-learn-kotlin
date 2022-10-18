package de.thermondo.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics3Test : BasePrintlnTest() {
    @Test
    fun `Validate helloWorld function`() {
        val kotlin = "Kotlin"
        helloParameter(value = kotlin)
        assertPrintln("Hello $kotlin!")
    }
}
