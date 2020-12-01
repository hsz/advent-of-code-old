package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.permutation
import mobi.hsz.adventofcode.permutation3

/**
 * Advent of Code 2020
 *
 * Day 1: Report Repair
 *
 * https://adventofcode.com/2020/day/1
 */
class Day01 : Day(2020, 1) {

    override fun part1(input: String) = input.lines().permutation().find {
        it.first.toInt() + it.second.toInt() == 2020
    }?.let {
        it.first.toInt() * it.second.toInt()
    } ?: 0

    override fun part2(input: String) = input.lines().permutation3().find {
        it.first.toInt() + it.second.toInt() + it.third.toInt() == 2020
    }?.let {
        it.first.toInt() * it.second.toInt() * it.third.toInt()
    } ?: 0
}
