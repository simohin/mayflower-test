package ru.simohin.mayflower.test.util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class UnexpectedEnumValueUtilKtTest {

    enum class TestEnum {
        TEST;

        companion object {
            @JvmStatic
            fun of(value: String): TestEnum = ofValueOrThrow(value)
        }

    }

    @Test
    fun `should fail on invalid value`() {
        val unexpected = "UNEXPECTED"

        val exception = assertThrows<RuntimeException> {
            TestEnum.of(unexpected)
        }

        assertEquals("Unexpected TestEnum UNEXPECTED", exception.message)

    }

    @Test
    fun `should correctly deserialize enum ignoring case on valid value`() = listOf(
        TestEnum.TEST.name,
        "test",
        "Test"
    ).forEach { assertEquals(TestEnum.TEST, TestEnum.of(it)) }
}