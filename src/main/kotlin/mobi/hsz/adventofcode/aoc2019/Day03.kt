package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.permutation
import kotlin.math.absoluteValue

/**
 * Advent of Code 2019
 *
 * Day 3: Crossed Wires
 *
 * https://adventofcode.com/2019/day/3
 */
class Day03 : Day(2019, 3) {
    override fun part1(input: String) = process(input).let { (a, b) ->
        a.intersect(b).map { it.first.absoluteValue + it.second.absoluteValue }.filter { it > 0 }.min()!!
    }

    override fun part2(input: String) = process(input).let { (a, b) ->
        a.intersect(b).map { a.indexOf(it) + b.indexOf(it) + 2 }.min()!!
    }

    private fun process(input: String) = input.lines().map {
        it.split(',').fold(listOf(0 to 0)) { grid, it1 ->
            val (x, y) = grid.last()
            val num = it1.substring(1).toInt()

            grid + when (it1.first()) {
                'R' -> ((x + 1)..(x + num)) to y..y
                'L' -> ((x - 1) downTo (x - num)) to y..y
                'U' -> x..x to ((y + 1)..(y + num))
                'D' -> x..x to ((y - 1) downTo (y - num))
                else -> throw Error()
            }.permutation()
        } - (0 to 0)
    }
}
