package de.thermondo.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics06Test {

    private val user1 = Basics06Solution(name = "Tom", age = 32)
    private val user2 = Basics06Solution(name = "Venelope", age = 21)

    @Test
    fun `Validate first user's name`() {
        assertEquals(expected = "Tom", actual = user1.userName)
    }

    @Test
    fun `Validate first user's age`() {
        assertEquals(expected = 32, actual = user1.userAge)
    }

    @Test
    fun `Validate second user's name`() {
        assertEquals(expected = "Venelope", actual = user2.userName)
    }

    @Test
    fun `Validate second user's age`() {
        assertEquals(expected = 21, actual = user2.userAge)
    }
}
