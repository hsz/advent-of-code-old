package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day
import hsz.mobi.adventofcode.aoc2015.Day06.OP.OFF
import hsz.mobi.adventofcode.aoc2015.Day06.OP.ON
import hsz.mobi.adventofcode.aoc2015.Day06.OP.TOGGLE
import hsz.mobi.adventofcode.aoc2015.Day06.OP.valueOf

/**
 * Advent of Code 2015
 *
 * Day 06: Probably a Fire Hazard
 *
 * https://adventofcode.com/0/day/0
 */
class Day06 : Day(2015, 6) {
    enum class OP { ON, OFF, TOGGLE }

    override fun part1(input: String) = process(input) { op, value ->
        when (op) {
            ON -> 1
            OFF -> 0
            TOGGLE -> (value + 1) % 2
        }
    }

    override fun part2(input: String) = process(input) { op, value ->
        when (op) {
            ON -> value + 1
            OFF -> (value - 1).coerceAtLeast(0)
            TOGGLE -> value + 2
        }
    }

    private fun process(input: String, callback: (OP, Int) -> Int) =
        input.lines().fold(mutableMapOf<Int, Int>()) { acc, v ->
            val op = valueOf("on|off|toggle".toRegex().find(v)!!.value.toUpperCase())
            val (x1, y1, x2, y2) = v.replace("""\D+""".toRegex(), " ").trim().split(' ').map(String::toInt)

            (x1..x2).forEach { x ->
                (y1..y2).forEach { y ->
                    (x * 1000 + y).apply {
                        acc[this] = callback(op, acc.getOrDefault(this, 0))
                    }
                }
            }

            acc
        }.values.sum()
}
