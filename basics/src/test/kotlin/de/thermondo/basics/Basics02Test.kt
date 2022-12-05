package de.thermondo.basics

import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.Test

class Basics02Test : BasePrintlnTest() {
    @Test
    fun `Validate helloWorld function`() {
        helloWorld()
        assertPrintln("Hello World!")
    }
}
