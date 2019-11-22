package hsz.mobi.adventofcode.aoc2015

import hsz.mobi.adventofcode.Day
import hsz.mobi.adventofcode.Utils
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Advent of Code 2015
 *
 * Day 4: The Ideal Stocking Stuffer
 *
 * https://adventofcode.com/2015/day/4
 */
class Day04 : Day(2015, 4) {
    override fun part1(input: String) = calc(input, 5)

    override fun part2(input: String) = calc(input, 6)

    private fun calc(input: String, zeros: Int) = Utils.generateUntil { "$input${it}".md5().length > 32 - zeros }

    private fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)
}