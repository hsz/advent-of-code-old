package mobi.hsz.adventofcode

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 0:")
class Day0Test : DayTest(Day0()) {

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
