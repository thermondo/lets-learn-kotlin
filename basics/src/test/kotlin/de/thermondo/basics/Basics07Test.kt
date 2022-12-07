package de.thermondo.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class Basics07SolutionTest {

    @Test
    fun `Validate the day of the week`() {
        assertNotNull(Basics07.SUNDAY)
        assertNotNull(Basics07.MONDAY)
        assertNotNull(Basics07.TUESDAY)
        assertNotNull(Basics07.WEDNESDAY)
        assertNotNull(Basics07.THURSDAY)
        assertNotNull(Basics07.FRIDAY)
        assertNotNull(Basics07.SATURDAY)
    }
}
