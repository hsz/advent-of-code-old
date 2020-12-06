package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2020
 *
 * Day 6: Custom Customs
 *
 * https://adventofcode.com/2020/day/6
 */
class Day06 : Day(2020, 6) {

    override fun part1(input: String) = input.process()

    override fun part2(input: String) = input.process { it.value.size == lines().size }

    private fun String.process(callback: (String).(Map.Entry<Char, List<Char>>) -> Boolean = { true }) = split("\n\n".toRegex())
        .map { group -> group.replace("\n", "").groupBy { it }.filter { callback(group, it) }.keys.size }.sum()
}
