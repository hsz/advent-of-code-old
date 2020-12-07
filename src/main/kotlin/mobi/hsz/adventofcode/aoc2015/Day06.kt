package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.aoc2015.Day06.OP.OFF
import mobi.hsz.adventofcode.aoc2015.Day06.OP.ON
import mobi.hsz.adventofcode.aoc2015.Day06.OP.TOGGLE
import mobi.hsz.adventofcode.aoc2015.Day06.OP.valueOf
import mobi.hsz.adventofcode.permutation

/**
 * Advent of Code 2015
 *
 * Day 6: Probably a Fire Hazard
 *
 * https://adventofcode.com/2015/day/6
 */
class Day06 : Day(2015, 6) {

    enum class OP { ON, OFF, TOGGLE }

    override fun part1(input: String) = process(input) { op ->
        when (op) {
            ON -> 1
            OFF -> 0
            TOGGLE -> (this + 1) % 2
        }
    }

    override fun part2(input: String) = process(input) { op ->
        when (op) {
            ON -> this + 1
            OFF -> (this - 1).coerceAtLeast(0)
            TOGGLE -> this + 2
        }
    }

    private fun process(input: String, callback: Int.(OP) -> Int) =
        input.lines().fold(mutableMapOf<Int, Int>()) { acc, v ->
            val op = valueOf("on|off|toggle".toRegex().find(v)!!.value.toUpperCase())
            val (x1, y1, x2, y2) = v.replace("""\D+""".toRegex(), " ").trim().split(' ').map(String::toInt)

            (x1..x2 to y1..y2).permutation().fold(acc) { _, (x, y) ->
                (x * 1000 + y).apply {
                    acc[this] = callback(acc.getOrDefault(this, 0), op)
                }.let { acc }
            }
        }.values.sum()
}
