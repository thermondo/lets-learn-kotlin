package de.thermondo.test.utils

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * This is used in other modules for testing
 */
@Suppress("UnnecessaryAbstractClass")
abstract class BasePrintlnTest {
    protected val outContent = ByteArrayOutputStream()

    @BeforeEach
    fun setup() {
        System.setOut(PrintStream(outContent))
    }

    @AfterEach
    fun teardown() {
        System.setOut(System.out)
    }

    fun assertPrintln(message: String) {
        assertEquals(message, outContent.toString().trim())
    }
}
