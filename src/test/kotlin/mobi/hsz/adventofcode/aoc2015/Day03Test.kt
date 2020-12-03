package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 3: Perfectly Spherical Houses in a Vacuum")
class Day03Test : DayTest(Day03()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 2572,
        data = listOf(
            ">" to 2,
            "^>v<" to 4,
            "^v^v^v^v^v" to 2,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 2631,
        data = listOf(
            "^v" to 3,
            "^>v<" to 3,
            "^v^v^v^v^v" to 11,
        )
    )
}
