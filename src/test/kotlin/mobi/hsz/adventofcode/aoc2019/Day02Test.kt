package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 2: 1202 Program Alarm")
class Day02Test: DayTest(Day02()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 3562624,
        custom = listOf(
            "1,0,0,0,99".intcode().first.first() to 2,
            "2,3,0,3,99".intcode().first.first() to 2,
            "2,4,4,5,99,0".intcode().first.first() to 2,
            "1,1,1,4,99,5,6,0,99".intcode().first.first() to 30,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 8298,
    )
}
