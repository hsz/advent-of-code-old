package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2019
 *
 * Day 5: Sunny with a Chance of Asteroids
 *
 * https://adventofcode.com/2019/day/5
 */
class Day05 : Day(2019, 5) {
    // 561 ++++
    override fun part1(input: String) = input.intcode(input = 1).second.last()

    override fun part2(input: String) = input.intcode(input = 5).second.last()
}
