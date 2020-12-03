package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 2: I Was Told There Would Be No Math")
class Day02Test : DayTest(Day02()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 1586300,
        data = listOf(
            "2x3x4" to 58,
            "1x1x10" to 43,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 3737498,
        data = listOf(
            "2x3x4" to 34,
            "1x1x10" to 14,
        )
    )
}
