package day01

import utils.readInput
import kotlin.math.abs

fun main() {
    val lines = readInput(1)
    val answer = part1(lines)
    println("day 1 part 1: $answer")

    val part2answer = part2(lines)
    println("day 1 part 2: $part2answer")
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

        if (position == 0) {
            count++
        }
    }

    return count
}

fun part2(lines: List<String>): Int {
    var count = 0
    var position = 50

    for (line in lines) {
        if (line.isBlank()) {
            continue
        }

        val dialDirectionIsReverse = line[0] == 'L'
        val dialMovement = line.substring(1).toInt()

        val originalPosition = position
        position = if (dialDirectionIsReverse) position - dialMovement else position + dialMovement

        count += dialMovement / 100

        position = position.mod(100)

        if (originalPosition == 0) {
            continue
        }

        if (position == 0 ||
            (dialDirectionIsReverse && position > originalPosition) ||
            (!dialDirectionIsReverse && position < originalPosition)) {
            count++
        }
    }

    return count
}