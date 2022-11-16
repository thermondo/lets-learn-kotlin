package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Basics07SolutionTest {
    private val days = Basics7Solution.values()

    @Test
    fun `Validate the day of the week`() {
        assertNotNull(Basics7Solution.SUNDAY)
        assertNotNull(Basics7Solution.MONDAY)
        assertNotNull(Basics7Solution.TUESDAY)
        assertNotNull(Basics7Solution.WEDNESDAY)
        assertNotNull(Basics7Solution.THURSDAY)
        assertNotNull(Basics7Solution.FRIDAY)
        assertNotNull(Basics7Solution.SATURDAY)
    }
}
