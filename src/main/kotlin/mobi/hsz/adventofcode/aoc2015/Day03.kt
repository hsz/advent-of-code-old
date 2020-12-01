package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.Utils
import mobi.hsz.adventofcode.plus

/**
 * Advent of Code 2015
 *
 * Day 3: Perfectly Spherical Houses in a Vacuum
 *
 * https://adventofcode.com/2015/day/3
 */
class Day03 : Day(2015, 3) {

    val map = Utils.mapper(0 to 0, '^' to (0 to 1), '>' to (1 to 0), 'v' to (0 to -1), '<' to (-1 to 0))

    override fun part1(input: String) =
        input.fold(listOf(0 to 0)) { acc, c -> acc + (acc.last() + map(c)) }.distinct().size

    override fun part2(input: String) =
        input.fold(listOf(0 to 0, 0 to 0)) { acc, c -> acc + (acc[acc.size - 2] + map(c)) }.distinct().size
}
