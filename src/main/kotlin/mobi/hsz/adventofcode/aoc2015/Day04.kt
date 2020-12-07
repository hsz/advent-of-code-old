package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.generateUntil
import mobi.hsz.adventofcode.md5

/**
 * Advent of Code 2015
 *
 * Day 4: The Ideal Stocking Stuffer
 *
 * https://adventofcode.com/2015/day/4
 */
class Day04 : Day(2015, 4) {

    override fun part1(input: String) = input.process(5)

    override fun part2(input: String) = input.process(6)

    private fun String.process(zeros: Int) = generateUntil { "$this${it}".md5().length > 32 - zeros }
}
