package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Basics13SolutionTest: BasePrintlnTest(){

    @Test
    fun `Validate the catch block`(){
        //assertEquals("Please check the array index\nI am finally and I execute no matter what", tryCatchException())
        tryCatchException()
        assertPrintln("Please check the array index\nI am finally and I execute no matter what")
    }
}
