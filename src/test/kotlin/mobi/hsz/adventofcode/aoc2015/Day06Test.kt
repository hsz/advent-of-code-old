package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 06: Probably a Fire Hazard")
class Day06Test : DayTest(Day06()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 543903,
        data = listOf(
            "turn on 0,0 through 999,999" to 1000000,
            "toggle 0,0 through 999,0" to 1000,
            "turn off 499,499 through 500,500" to 0,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 14687245,
        data = listOf(
            "turn on 0,0 through 0,0" to 1,
            "toggle 0,0 through 999,999" to 2000000,
        )
    )
}
