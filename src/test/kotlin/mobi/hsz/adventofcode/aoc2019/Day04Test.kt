package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 4: Secure Container")
class Day04Test : DayTest(Day04()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 1246,
        data = listOf(
            "111111-111111" to 1,
            "223450-223450" to 0,
            "123789-123789" to 0,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 814,
        data = listOf(
            "112233-112233" to 1,
            "123444-123444" to 0,
            "111122-111122" to 1,
        )
    )
}
