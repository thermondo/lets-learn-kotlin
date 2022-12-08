package de.thermondo.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics26Test : BasePrintlnTest() {

    @Test
    fun `Validate the split function`() {
        splitFun()
        assertPrintln("[12, 345, 6, A]")
    }
}
