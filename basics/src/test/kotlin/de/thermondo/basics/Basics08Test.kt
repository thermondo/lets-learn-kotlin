package de.thermondo.basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Basics08Test {

    @Test
    fun `Validate the rgb value of the color`() {
        assertEquals(16711680, Basics08.RED.rgb())
        assertEquals(16779520, Basics08.ORANGE.rgb())
        assertEquals(16776960, Basics08.YELLOW.rgb())
        assertEquals(65280, Basics08.GREEN.rgb())
        assertEquals(255, Basics08.BLUE.rgb())
        assertEquals(4915330, Basics08.INDIGO.rgb())
        assertEquals(15631086, Basics08.VIOLET.rgb())
    }
}
