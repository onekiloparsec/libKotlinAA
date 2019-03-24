package com.onekiloparsec

import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinAATest {
    @Test fun testMyLanguage() {
        assertEquals("Kotlin", KotlinAA().kotlinLanguage().name)
        assertEquals(10, KotlinAA().kotlinLanguage().hotness)
    }
}

