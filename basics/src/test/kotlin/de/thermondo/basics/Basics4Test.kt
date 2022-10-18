package de.thermondo.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics4Test {
    @Test
    fun `Validate adding 15 and 20 returns 35`() {
        val expected = 35
        assertEquals(expected, add(15, 20))
    }
}
