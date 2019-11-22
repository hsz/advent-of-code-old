package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day
import hsz.mobi.adventofcode.Utils

/**
 * Advent of Code 2015
 *
 * Day 1: Not Quite Lisp
 *
 * https://adventofcode.com/2015/day/1
 */
class Day01 : Day(2015, 1) {
    val map = Utils.mapper(-1, '(' to 1, 's' to 1)

    override fun part1(input: String) = input.map(map).sum()

    override fun part2(input: String) =
        input.foldIndexed(0) { index, acc, v ->
            (acc + map(v)).apply {
                if (this == -1) {
                    return index + 1
                }
            }
        }
}
