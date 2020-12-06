package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2020, Day 6: Custom Customs")
class Day06Test : DayTest(Day06()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 6903,
        data = listOf(
            """
                abc

                a
                b
                c

                ab
                ac

                a
                a
                a
                a

                b

            """ to 11
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 3493,
    )
}
