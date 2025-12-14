package utils

import java.io.File
import kotlin.io.*

fun readInput(day: Int): List<String> {
    val dayString = day.toString().padStart(2, '0')
    return File("src/main/resources", "day$dayString.txt").readLines()
}
