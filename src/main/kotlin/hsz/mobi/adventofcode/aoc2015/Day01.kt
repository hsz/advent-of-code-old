package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day

/**
 * Advent of Code 2015
 *
 * Day 1: Not Quite Lisp
 *
 * https://adventofcode.com/2015/day/1
 */
class Day01 : Day(2015, 1) {
    override fun part1(input: String) = input.map(this::convert).sum()

    override fun part2(input: String) = input.foldIndexed(0) { index, acc, v ->
        (acc + convert(v)).apply {
            if (this == -1) return index + 1
        }
    }

    private fun convert(v: Char) = when (v) {
        '(' -> 1
        else -> -1
    }
}
