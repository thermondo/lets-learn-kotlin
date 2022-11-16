package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics08SolutionTest{

    private val colors = Basics8Solution.values()

    @Test
    fun `Validate the rgb value of a color`(){
        assertEquals(16711680, Basics8Solution.RED.rgb())
        assertEquals(16779520, Basics8Solution.ORANGE.rgb())
        assertEquals(16776960, Basics8Solution.YELLOW.rgb())
        assertEquals(65280, Basics8Solution.GREEN.rgb())
        assertEquals(255, Basics8Solution.BLUE.rgb())
        assertEquals(4915330, Basics8Solution.INDIGO.rgb())
        assertEquals(15631086, Basics8Solution.VOILET.rgb())
    }
}
