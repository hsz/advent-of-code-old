package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.permutation

/**
 * Advent of Code 2020
 *
 * Day 1: Report Repair
 *
 * https://adventofcode.com/2020/day/1
 */
class Day01 : Day(2020, 1) {

    override fun part1(input: String) = input.lines().map(String::toInt).permutation()
        .find { it.first + it.second == year }
        ?.let { it.first * it.second }
        ?: 0

    override fun part2(input: String) = input.lines().map(String::toInt).run {
        permutation().find {
            find { z -> it.first + it.second + z == year }
                ?.let { z -> return@run it.first * it.second * z } ?: false
        }
        0
    }
}
