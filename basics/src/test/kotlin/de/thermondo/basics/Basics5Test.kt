package de.thermondo.basics

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Basics5Test {

    private val clazz = Basics5()

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
