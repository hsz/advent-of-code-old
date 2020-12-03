package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 7: Some Assembly Required")
class Day07Test : DayTest(Day07()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 0,
        data = listOf(

        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 0,
        data = listOf(

        )
    )
}
