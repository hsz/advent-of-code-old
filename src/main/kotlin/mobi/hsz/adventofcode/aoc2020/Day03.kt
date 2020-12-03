package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2020
 *
 * Day 3: Toboggan Trajectory
 *
 * https://adventofcode.com/2020/day/3
 */
class Day03 : Day(2020, 3) {

    override fun part1(input: String) = input.process(3, 1)

    override fun part2(input: String) = listOf(1 to 1, 3 to 1, 5 to 1, 7 to 1, 1 to 2).map {
        input.process(it.first, it.second).toLong()
    }.reduce { acc, i -> acc * i }

    private fun String.process(right: Int, down: Int) = lines()
        .filterIndexed { index, _ -> index % down == 0 }
        .run { mapIndexed { index, line -> line[index * right % line.length] == '#' }.count { it } }
}
