package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Basics17SolutionTest{
    @Test
    fun `Validate the correct string`(){
        assertEquals("(One; Two; Three)", joinAndStringConversion())
    }
}
