package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Basics15SolutionTest{

    @Test
    fun `Validate the integers`(){
        assertEquals(456, tryCatch())
    }
/*
    @Test
    fun `Validate the exception`(){
        assertEquals(0, tryCatch())
    }
*/

}
