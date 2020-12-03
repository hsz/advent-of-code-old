package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2020, Day 2: Password Philosophy")
class Day02Test : DayTest(Day02()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 398,
        data = listOf(
            """
                1-3 a: abcde
                1-3 b: cdefg
                2-9 c: ccccccccc
            """ to 2,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 562,
        data = listOf(
            """
                1-3 a: abcde
                1-3 b: cdefg
                2-9 c: ccccccccc
            """.trimIndent() to 1,
        )
    )
}
