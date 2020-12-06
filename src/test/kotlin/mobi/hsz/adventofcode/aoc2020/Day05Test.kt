package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2020, Day 5: Binary Boarding")
class Day05Test : DayTest(Day05()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 996,
        data = listOf(
            "FBFBBFFRLR" to 357,
            "BFFFBBFRRR" to 567,
            "FFFBBBFRRR" to 119,
            "BBFFBBFRLL" to 820,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 671,
    )
}
