package mobi.hsz.adventofcode

abstract class Day(val year: Number, val day: Number) {

    private var input = Resources.asString("aoc${year}/day${day.toString().padStart(2, '0')}.txt")

    fun part1() = part1(input)

    fun part2() = part2(input)

    abstract fun part1(input: String): Int

    abstract fun part2(input: String): Int
}
