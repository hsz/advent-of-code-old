package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 4: The Ideal Stocking Stuffer")
class Day04Test : DayTest(Day04()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 254575,
        data = listOf(
            "abcdef" to 609043,
            "pqrstuv" to 1048970,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 1038736,
        data = listOf(

        )
    )
}
