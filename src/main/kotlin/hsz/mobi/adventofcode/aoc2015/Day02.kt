package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day

/**
 * Advent of Code 2015
 *
 * Day 2: I Was Told There Would Be No Math
 *
 * https://adventofcode.com/2015/day/2
 */
class Day02 : Day(2015, 2) {
    override fun part1(input: String) = convert(input) { (a, b, c) -> 3 * a * b + 2 * a * c + 2 * b * c }

    override fun part2(input: String) = convert(input) { (a, b, c) -> 2 * a + 2 * b + a * b * c }

    private fun convert(input: String, callback: (List<Int>) -> Int) = input.split('\n').sumBy {
        it.split('x').map { s -> s.toInt() }.sorted().let(callback)
    }
}
