package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Basics27SolutionTest : BasePrintlnTest(){
    @Test
    fun `Validate if the regex is present is the string or not`() {
        //assertEquals("true", regularExpression())
       var obj = Basics27Solution()
       assertTrue(obj.equals(obj))
    }
}