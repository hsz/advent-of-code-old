package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 1: Not Quite Lisp")
class Day01Test : DayTest(Day01()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 280,
        data = listOf(
            "(())" to 0,
            "(((" to 3,
            "(()(()(" to 3,
            "))(((((" to 3,
            "())" to -1,
            "))(" to -1,
            ")))" to -3,
            ")())())" to -3,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 1797,
        data = listOf(
            ")" to 1,
            "()())" to 5,
        )
    )
}
