package com.porto.lib

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleLibTest {

    @Test
    fun testMessage() {
        val lib = ExampleLib()
        val result = lib.message()
        assertEquals("Hello from the Library!", result)
    }
}