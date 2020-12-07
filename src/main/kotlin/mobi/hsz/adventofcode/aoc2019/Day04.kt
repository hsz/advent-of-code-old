package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2019
 *
 * Day 4: Secure Container
 *
 * https://adventofcode.com/2019/day/4
 */
class Day04 : Day(2019, 4) {

    override fun part1(input: String) = input.process { it.contains("""(\d)\1""".toRegex()) }

    override fun part2(input: String) = input.process {
        """(\d)\1+""".toRegex().findAll(it).any { m -> m.value.length == 2 }
    }

    private fun String.process(callback: (String) -> Boolean) =
        split('-').map(String::toInt).let { (a, b) -> a..b }.filter {
            "$it".zipWithNext().fold(true) { acc, (l, r) -> acc && l <= r && callback("$it") }
        }.count()
}
