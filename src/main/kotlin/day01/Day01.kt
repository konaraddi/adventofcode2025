package day01

import utils.readInput

fun main() {
    val lines = readInput(1)
    val answer = part1(lines)
    println("day 1: $answer")
}

fun part1(lines: List<String>): Int {
    var count = 0
    var position = 50

    for (line in lines) {
        if (line.isBlank()) {
            continue
        }

        val dialDirectionIsReverse = line[0] == 'L'
        val dialMovement = line.substring(1).toInt()

        position = if (dialDirectionIsReverse) position - dialMovement else position + dialMovement

        position = position.mod(100)

        when {
            position < 0 -> position += 100
            position > 99 -> position -= 100
            position == 0 -> count++
        }
    }

    return count
}