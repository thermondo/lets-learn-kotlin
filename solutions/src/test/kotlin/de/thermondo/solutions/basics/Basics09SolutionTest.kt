package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics09SolutionTest : BasePrintlnTest() {
    class Basics09SolutionTest {

        @Test
        fun `Validate the corresponding month number`() {
            // enumMonths()
            // assertEquals(1, Basics09Solution.JANUARY.enumMonths())
            // assertEquals(2, Basics09Solution.FEBRUARY.enumMonths())
            assertEquals(3, Basics09Solution.MARCH.enumMonths())
            // assertEquals(4, Basics09Solution.APRIL.enumMonths())
        }
        /*@Test
        fun `Validate the corresponding April month number`() {
            assertEquals(4, Basics09Solution.APRIL.enumMonths())
        }*/
    }
}
