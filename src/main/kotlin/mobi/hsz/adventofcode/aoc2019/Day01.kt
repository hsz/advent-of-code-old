package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2019
 *
 * Day 1: The Tyranny of the Rocket Equation
 *
 * https://adventofcode.com/2019/day/1
 */
class Day01 : Day(2019, 1) {
    override fun part1(input: String) = process(input, List<Int>::first)

    override fun part2(input: String) = process(input, List<Int>::sum)

    private fun process(input: String, callback: (List<Int>) -> Int) = input.split('\n').sumBy {
        callback(calc(it.toInt()))
    }

    private fun calc(v: Int, l: List<Int> = emptyList()): List<Int> =
        (v / 3 - 2).let { if (it < 0) l else calc(it, l + it) }
}
