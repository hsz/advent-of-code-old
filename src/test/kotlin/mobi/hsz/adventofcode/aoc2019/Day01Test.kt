package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 1: The Tyranny of the Rocket Equation")
class Day01Test : DayTest(Day01()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 3481005,
        data = listOf(
            "12" to 2,
            "14" to 2,
            "1969" to 654,
            "100756" to 33583,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 5218616,
        data = listOf(
            "14" to 2,
            "1969" to 966,
            "100756" to 50346,
        )
    )
}
