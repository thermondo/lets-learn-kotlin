package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class Basics07SolutionTest : BasePrintlnTest() {

    @Test
    fun `Validate the day of the week`() {
        assertNotNull(Basics07Solution.SUNDAY)
        assertNotNull(Basics07Solution.MONDAY)
        assertNotNull(Basics07Solution.TUESDAY)
        assertNotNull(Basics07Solution.WEDNESDAY)
        assertNotNull(Basics07Solution.THURSDAY)
        assertNotNull(Basics07Solution.FRIDAY)
        assertNotNull(Basics07Solution.SATURDAY)
    }

    @Test
    fun `Validate the print fun`() {
        printEnum()
        assertPrintln("SUNDAY\nMONDAY\nTUESDAY\nWEDNESDAY\nTHURSDAY\nFRIDAY\nSATURDAY")
    }
}
