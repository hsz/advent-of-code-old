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
    override fun part1(input: String) = 0

    override fun part2(input: String) = 0

    fun process(input: String, noun: Int? = null, verb: Int? = null): MutableList<Int> =
        input.split(',').map(String::toInt).toMutableList().apply {
            set(1, noun ?: get(1))
            set(2, verb ?: get(2))
        }.apply {
            (0..size step 4).forEach {
                when (get(it)) {
                    1 -> set(get(it + 3), get(get(it + 1)) + get(get(it + 2)))
                    2 -> set(get(it + 3), get(get(it + 1)) * get(get(it + 2)))
                    99 -> return this
                }
            }
        }
}
