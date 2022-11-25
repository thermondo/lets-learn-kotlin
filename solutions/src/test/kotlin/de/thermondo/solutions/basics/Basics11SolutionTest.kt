package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics11SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validate if the hello printed 5 times`() {
        hello()
        assertPrintln("Hello!\nHello!\nHello!\nHello!\nHello!")
    }
}
