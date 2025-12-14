package day04

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day04Test {

    private val testInput = """
        sample
    """.trimIndent().lines()

    @Test
    fun `part 1`() {
        assertEquals(1, part1(testInput))
    }

    @Test
    fun `part 2`() {
        assertEquals(1, part2(testInput))
    }
}
