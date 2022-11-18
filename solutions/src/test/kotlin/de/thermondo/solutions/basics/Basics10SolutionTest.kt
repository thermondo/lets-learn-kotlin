package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.reflect.KMutableProperty

class Basics10Solution {

    @Test
    fun `Validate if the index is within the range or not`() {
        val i =Basics10Solution()
        when (i in 2..20 && i % 2 == 0) {
            assertEquals(4, loopWhile())
        }
    }
}


