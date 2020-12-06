package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2020
 *
 * Day 5: Binary Boarding
 *
 * https://adventofcode.com/2020/day/5
 */
class Day05 : Day(2020, 5) {

    override fun part1(input: String) = input.process().maxOrNull()!!

    override fun part2(input: String) = input.process().run {
        (IntRange(minOrNull()!!, maxOrNull()!!).toList() - this).first()
    }

    private fun String.process(callback: Map<String, String>.() -> Boolean = { true }) = lines().map {
        Integer.parseInt(it.take(7).replace('B', '1').replace('F', '0'), 2) * 8 +
            Integer.parseInt(it.drop(7).replace('R', '1').replace('L', '0'), 2)
    }
}
