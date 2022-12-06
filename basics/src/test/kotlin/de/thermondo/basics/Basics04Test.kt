package de.thermondo.basics

import kotlin.test.Test
import kotlin.test.assertEquals

class Basics04Test {
    @Test
    fun `Validate adding 15 and 20 returns 35`() {
        val expected = 35
        assertEquals(expected, add(15, 20))
    }
}
