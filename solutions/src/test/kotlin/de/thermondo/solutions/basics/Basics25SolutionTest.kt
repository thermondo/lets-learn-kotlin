package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics25SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validating the string equivalent`() {
        destructuringDeclaration()
        assertPrintln("One\nSeven\nFifty-Three")
    }
}
