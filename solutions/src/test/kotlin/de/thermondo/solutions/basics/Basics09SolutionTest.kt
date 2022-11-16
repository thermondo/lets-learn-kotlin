package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics09SolutionTest {

    private val month = Basics09Solutions.values()

    @Test
    fun `Validate the corresponding month number`(){
        assertEquals(5, Basics09Solutions.MAY)
    }
}
