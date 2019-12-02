package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day
import hsz.mobi.adventofcode.Utils

/**
 * Advent of Code 2015
 *
 * Day 5: Doesn't He Have Intern-Elves For This?
 *
 * https://adventofcode.com/2015/day/5
 */
class Day05 : Day(2015, 5) {
    val map = Utils.mapper(0, true to 1)

    override fun part1(input: String) = process(input, """(.)\1""", """([aeiou].*){3}""", """^((?!ab|cd|pq|xy).)*$""")

    override fun part2(input: String) = process(input, """(..).*\1""", """(.).\1""")

    private fun process(input: String, vararg patterns: String) = input.lines().sumBy {
        map(patterns.fold(true) { acc, v -> acc && v.toRegex().containsMatchIn(it) })
    }
}
