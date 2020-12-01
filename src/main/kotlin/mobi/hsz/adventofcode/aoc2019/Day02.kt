package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.permutation

/**
 * Advent of Code 2019
 *
 * Day 2: 1202 Program Alarm
 *
 * https://adventofcode.com/2019/day/2
 */
class Day02 : Day(2019, 2) {

    override fun part1(input: String) = input.intcode(12, 2).first.first()

    override fun part2(input: String) = input.intcode().let {
        (0..99).permutation().find { (noun, verb) ->
            input.intcode(noun, verb).first.first() == 19690720
        }.let {
            it!!.first * 100 + it.second
        }
    }
}
