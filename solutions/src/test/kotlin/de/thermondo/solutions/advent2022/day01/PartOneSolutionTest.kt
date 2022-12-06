package de.thermondo.solutions.advent2022.day01

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartOneSolutionTest {
    @Test
    fun testCalculateCaloriesPartOne() {
        assertEquals(24000, calculateCaloriesPartOne(input = INPUT))
    }
}
