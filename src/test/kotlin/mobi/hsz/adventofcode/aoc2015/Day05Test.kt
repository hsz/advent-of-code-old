package mobi.hsz.adventofcode.aoc2015

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2015, Day 5: Doesn't He Have Intern-Elves For This?")
class Day05Test : DayTest(Day05()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 258,
        data = listOf(
            "ugknbfddgicrmopn" to 1,
            "aaa" to 1,
            "jchzalrnumimnmhp" to 0,
            "haegwjzuvuyypxyu" to 0,
            "dvszwmarrgswjxmb" to 0,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 53,
        data = listOf(
            "qjhvhtzxzqqjkmpb" to 1,
            "xxyxx" to 1,
            "uurcxstgmygtbstg" to 0,
            "ieodomkazucvgmuy" to 0,
        )
    )
}
