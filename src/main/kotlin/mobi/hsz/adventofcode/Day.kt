package mobi.hsz.adventofcode

abstract class Day(val year: Number, val day: Number) {

    val input = Resources.asString("aoc${year}/day${day.toString().padStart(2, '0')}.txt")

    abstract fun part1(input: String): Int

    abstract fun part2(input: String): Int
}
