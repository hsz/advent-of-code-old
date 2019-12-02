package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day

/**
 * Advent of Code 2015
 *
 * Day 7: Some Assembly Required
 *
 * https://adventofcode.com/2015/day/7
 */
class Day07 : Day(2015, 7) {
    data class Gate(val a: String, val b: String, val op: String, val dest: String);

    override fun part1(input: String) = 0
//    override fun part1(input: String) = input.lines().fold(mutableMapOf<String, Int>()) { acc, v ->
//        val (a, op, b, dest) = """(?:([a-z]+|\d+)?([A-Z]+))?([a-z]+|\d+)->([a-z]+)""".toRegex().find(
//            v.replace(
//                " ",
//                ""
//            )
//        )!!.destructured
//
//        println(v)
////        acc.put(dest, )
//        acc.values
//    }

    override fun part2(input: String) = 0
}
