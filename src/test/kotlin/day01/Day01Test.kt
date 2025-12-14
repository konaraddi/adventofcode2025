package day01

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day01Test {

    private val testInput1 = """
        L4
        R8
        L4
        R12
        L12
        R50
        L100
    """.trimIndent().lines()

    @Test
    fun `testInput1 part1`() {
        assertEquals(2, part1(testInput1))
    }
}
