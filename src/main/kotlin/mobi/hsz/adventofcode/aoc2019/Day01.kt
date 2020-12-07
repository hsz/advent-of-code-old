package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.unaryPlus

/**
 * Advent of Code 2019
 *
 * Day 1: The Tyranny of the Rocket Equation
 *
 * https://adventofcode.com/2019/day/1
 */
class Day01 : Day(2019, 1) {

    override fun part1(input: String) = input.process(List<Int>::first)

    override fun part2(input: String) = input.process(List<Int>::sum)

    private fun String.process(callback: (List<Int>) -> Int) = split('\n').sumBy { callback(calc(+it)) }

    private fun calc(v: Int, l: List<Int> = emptyList()): List<Int> =
        (v / 3 - 2).let { if (it < 0) l else calc(it, l + it) }
}
