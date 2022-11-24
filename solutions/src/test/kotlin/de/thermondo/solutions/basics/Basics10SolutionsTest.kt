package de.thermondo.solutions.basics

import de.thermondo.test.utils.BasePrintlnTest
import org.junit.jupiter.api.Test

class Basics10SolutionsTest : BasePrintlnTest() {

    @Test
    fun `Validate if the index is within the range or not`() {
        basics10Solution()
        assertPrintln("2\n4\n6\n8\n10\n12\n14\n16\n18\n20")
    }
}
