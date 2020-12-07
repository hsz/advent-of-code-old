package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.mapper

/**
 * Advent of Code 2015
 *
 * Day 5: Doesn't He Have Intern-Elves For This?
 *
 * https://adventofcode.com/2015/day/5
 */
class Day05 : Day(2015, 5) {

    val map = mapper(0, true to 1)

    override fun part1(input: String) = input.process("""(.)\1""", """([aeiou].*){3}""", """^((?!ab|cd|pq|xy).)*$""")

    override fun part2(input: String) = input.process("""(..).*\1""", """(.).\1""")

    private fun String.process(vararg patterns: String) = lines().sumBy {
        map(patterns.fold(true) { acc, v -> acc && v.toRegex().containsMatchIn(it) })
    }
}
