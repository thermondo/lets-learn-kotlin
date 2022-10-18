package de.thermondo.solutions.basics

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class Basics2SolutionKtTest {

    private val outContent = ByteArrayOutputStream()

    @BeforeTest
    fun setup() {
        System.setOut(PrintStream(outContent))
    }

    @AfterTest
    fun teardown() {
        System.setOut(System.out)
    }

    @Test
    fun `Validate helloWorld function`() {
        helloWorld()
        assertEquals("Hello World!", outContent.toString().trim())
    }
}
