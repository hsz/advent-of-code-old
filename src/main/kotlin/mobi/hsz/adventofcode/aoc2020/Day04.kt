package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.Day
import mobi.hsz.adventofcode.mapper

/**
 * Advent of Code 2020
 *
 * Day 4: Passport Processing
 *
 * https://adventofcode.com/2020/day/4
 */
class Day04 : Day(2020, 4) {

    val map = mapper(
        { true },
        "byr" to { v: String -> (1920..2002).contains(v.toInt()) },
        "iyr" to { v: String -> (2010..2020).contains(v.toInt()) },
        "eyr" to { v: String -> (2020..2030).contains(v.toInt()) },
        "hgt" to { v: String ->
            when (val suffix = v.takeLast(2)) {
                "cm" -> (150..193).contains(v.removeSuffix(suffix).toInt())
                "in" -> (59..76).contains(v.removeSuffix(suffix).toInt())
                else -> false
            }
        },
        "hcl" to { v: String -> v.matches("#[\\da-f]{6}".toRegex()) },
        "ecl" to { v: String -> listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth").contains(v) },
        "pid" to { v: String -> v.matches("\\d{9}".toRegex()) },
    )

    override fun part1(input: String) = input.process()

    override fun part2(input: String) = input.process {
        entries.all { (key, value) -> map(key)(value) }
    }

    private fun String.process(callback: Map<String, String>.() -> Boolean = { true }) = split("\n\n".toRegex())
        .map { passport ->
            passport.split("[ \n]".toRegex()).associate {
                it.split(":").run { first() to last() }
            }
        }.filter {
            (it.size == 8 || (it.size == 7 && it["cid"] == null)) && callback(it)
        }.size
}
