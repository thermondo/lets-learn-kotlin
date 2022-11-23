package de.thermondo.solutions.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics08SolutionTest{

    @Test
    fun `Validate the rgb value of the color`(){
        assertEquals(16711680, Basics08Solution.RED.rgb())
        assertEquals(16779520, Basics08Solution.ORANGE.rgb())
        assertEquals(16776960, Basics08Solution.YELLOW.rgb())
        assertEquals(65280, Basics08Solution.GREEN.rgb())
        assertEquals(255, Basics08Solution.BLUE.rgb())
        assertEquals(4915330, Basics08Solution.INDIGO.rgb())
        assertEquals(15631086, Basics08Solution.VIOLET.rgb())
    }
}
