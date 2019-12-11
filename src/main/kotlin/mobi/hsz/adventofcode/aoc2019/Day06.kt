package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Day

/**
 * Advent of Code 2019
 *
 * Day 6: Universal Orbit Map
 *
 * https://adventofcode.com/2019/day/6
 */
class Day06 : Day(2019, 6) {
    override fun part1(input: String) = process(input).run {
        sumBy { it.size - 1 }
    }

    override fun part2(input: String) = process(input).run {
        filter { it.last() in listOf("YOU", "SAN") }.run {
            sumBy { it.size } - (first().intersect(last()).size - 1) * 2 - 6
        }
    }

    private fun process(input: String) = input.lines().groupBy({ key: String -> key.split(')').first() }) {
        it.split(')').last()
    }.run { go(this) }

    private fun go(
        map: Map<String, List<String>>,
        key: String = "COM",
        path: List<String> = emptyList()
    ): List<List<String>> = listOf(path + key) + map.getOrDefault(key, emptyList()).map {
        go(map, it, path + it)
    }.flatten()
}
