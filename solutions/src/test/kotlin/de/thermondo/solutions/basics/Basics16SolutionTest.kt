package de.thermondo.solutions.basics

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Basics16SolutionTest{
    @Test
    fun `Validate whether the number is greatest or not`(){
        assertEquals(52, intCollection())
    }

    @Test
    fun `Validate the last element`(){
        assertEquals("Last", stringCollection())
    }
}
