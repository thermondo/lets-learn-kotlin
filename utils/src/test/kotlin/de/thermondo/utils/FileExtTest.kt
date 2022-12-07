package de.thermondo.utils

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class FileExtTest {
    @Test
    fun `Validate file to string from path`() {
        assertEquals("kotlin", stringFromFile("/TestFile.txt"))
    }

    @Test
    fun `Validate null value when path isn't found`() {
        assertNull(stringFromFile(path = "/not/a/real/path"))
    }
}
