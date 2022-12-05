package de.thermondo.solutions.basics

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Basics05SolutionTest {

    private val clazz = Basics05Solution()

    @Test
    fun `Validate that class exists`() {
        assertNotNull(clazz)
    }

    @Test
    fun `Validate name is Kotlin`() {
        assertEquals(expected = "Kotlin", actual = clazz.name)
    }

    @Test
    fun `Validate age is 26`() {
        assertEquals(expected = 26, actual = clazz.age)
    }
}
