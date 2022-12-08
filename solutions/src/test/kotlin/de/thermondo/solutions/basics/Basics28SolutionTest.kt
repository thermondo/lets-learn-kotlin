package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Basics28SolutionTest : BasePrintlnTest(){

    @Test
    fun `Validate the pattern of K`(){
        tripleQuoted()
        assertPrintln("| //\n|//\n|/ \\")
    }
}
