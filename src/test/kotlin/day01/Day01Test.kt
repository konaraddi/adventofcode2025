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

    private val testInput2 = """
        R50
        L301
        R402
    """.trimIndent().lines()

    private val testInput3 = """
        L51
    """.trimIndent().lines()

    private val testInput4 = """
        R50
        L101
    """.trimIndent().lines()

    @Test
    fun part1() {
        assertEquals(2, part1(testInput1))
    }

    @Test
    fun part2() {
        assertEquals(2, part2(testInput1))
        assertEquals(9, part2(testInput2))
        assertEquals(1, part2(testInput3))
        assertEquals(2, part2(testInput4))
    }
}
