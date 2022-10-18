package de.thermondo.solutions.basics

import kotlin.reflect.KMutableProperty
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Basics1SolutionTest {

    @Test
    fun `validate immutable value instantiation`() {
        val expected = 15
        assertEquals(expected, immutableValue)
    }

    @Test
    fun `validate val was used`() {
        assertFalse { ::immutableValue is KMutableProperty<*> }
    }

    @Test
    fun `validate mutable value instantiation`() {
        val expected = 16
        assertEquals(expected, mutableValue)
    }

    @Test
    fun `validate var was used`() {
        assertTrue { ::mutableValue is KMutableProperty<*> }
    }
}
