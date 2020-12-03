package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 5: Sunny with a Chance of Asteroids")
class Day05Test : DayTest(Day05()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 6745903,
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 9168267,
    )
}
