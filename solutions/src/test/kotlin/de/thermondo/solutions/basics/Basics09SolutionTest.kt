package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test
import de.thermondo.test.utils.BasePrintlnTest
import kotlin.test.assertEquals

class Basics09SolutionTest: BasePrintlnTest() {
    class Basics09SolutionTest {

        @Test
        fun `Validate the corresponding month number`() {
            assertEquals(12, enumMonths())
        }
    }
}
