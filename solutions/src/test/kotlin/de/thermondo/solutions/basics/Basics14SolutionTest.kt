package de.thermondo.solutions.basics

//import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Basics14SolutionTest{
    private val x = count(count = 5)
   @Test
   fun `Validate the count`() {
       assertEquals(5, x)
   }
}
