package de.thermondo.advent2022.day01

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartTwoTest {
    @Test
    fun testCalculateCaloriesPartTwo() {
        assertEquals(45000, calculateCaloriesPartTwo(input = INPUT, count = 3))
    }
}
