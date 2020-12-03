package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2020, Day 1: Report Repair")
class Day01Test : DayTest(Day01()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 436404,
        data = listOf(
            """
                1721
                979
                366
                299
                675
                1456
            """ to 514579,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 274879808,
        data = listOf(
            """
                1721
                979
                366
                299
                675
                1456
            """.trimIndent() to 241861950,
        )
    )
}

