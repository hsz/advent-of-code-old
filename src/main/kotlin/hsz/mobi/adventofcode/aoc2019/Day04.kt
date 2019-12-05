package hsz.mobi.adventofcode.aoc2019

import hsz.mobi.adventofcode.Day

/**
 * Advent of Code 2019
 *
 * Day 4: Secure Container
 *
 * https://adventofcode.com/2019/day/4
 */
class Day04 : Day(2019, 4) {
    override fun part1(input: String) = process(input) { it.contains("""(\d)\1""".toRegex()) }

    override fun part2(input: String) = process(input) {
        """(\d)\1+""".toRegex().findAll(it).any { m -> m.value.length == 2 }
    }

    private fun process(input: String, callback: (String) -> Boolean) =
        input.split('-').map(String::toInt).let { (a, b) -> a..b }.filter {
            "$it".zipWithNext().fold(true) { acc, (l, r) -> acc && l <= r && callback("$it") }
        }.count()
}
