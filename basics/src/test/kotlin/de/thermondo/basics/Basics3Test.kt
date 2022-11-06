package de.thermondo.basics

import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.Test

class Basics3Test : BasePrintlnTest() {
    @Test
    fun `Validate helloParameter function`() {
        val kotlin = "Kotlin"
        helloParam(value = kotlin)
        assertPrintln("Hello $kotlin!")
    }
}
