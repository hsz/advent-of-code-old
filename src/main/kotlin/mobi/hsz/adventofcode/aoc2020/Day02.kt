package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.unaryPlus

/**
 * Advent of Code 2020
 *
 * Day 2: Password Philosophy
 *
 * https://adventofcode.com/2020/day/2
 */

class Day02 : Day(2020, 2) {

    override fun part1(input: String) = input.process { a, b, char, pass ->
        IntRange(a, b).contains(pass.count { it == char })
    }

    override fun part2(input: String) = input.process { a, b, char, pass ->
        (pass[a - 1] == char || pass[b - 1] == char) && pass[a - 1] != pass[b - 1]
    }

    private fun String.process(callback: (Int, Int, Char, String) -> Boolean) = lines().map {
        val (from, to, char, pass) = Regex("(\\d+)-(\\d+) (\\w): (\\w+)").find(it)!!.destructured
        callback(+from, +to, char.first(), pass)
    }.count { it }
}
