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
    override fun part1(input: String) = process(input, 12, 2).first()

    override fun part2(input: String) = process(input).let {
        (0..99).permutation().find { (noun, verb) ->
            process(input, noun, verb).first() == 19690720
        }.let {
            it!!.first * 100 + it.second
        }
    }

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
