package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.Utils
import mobi.hsz.adventofcode.md5

/**
 * Advent of Code 2015
 *
 * Day 4: The Ideal Stocking Stuffer
 *
 * https://adventofcode.com/2015/day/4
 */
class Day04 : Day(2015, 4) {
    override fun part1(input: String) = process(input, 5)

    override fun part2(input: String) = process(input, 6)

    private fun process(input: String, zeros: Int) = Utils.generateUntil { "$input${it}".md5().length > 32 - zeros }
}
