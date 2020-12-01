package mobi.hsz.adventofcode.aoc2020

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("Advent of Code 2020, Day 1: Report Repair")
class Day01Test {

    @ParameterizedTest
    @ValueSource(
        strings = [
            "1721\n979\n366\n299\n675\n1456"
        ]
    )
    @DisplayName("Part 1")
    fun part1(input: String) = assertEquals(514579, Day01().part1(input))

    @Test
    @DisplayName("Part 1 - Solution")
    fun part1Solution() = assertEquals(436404, Day01().part1())

    @ParameterizedTest
    @ValueSource(
        strings = [
            "1721\n979\n366\n299\n675\n1456"
        ]
    )
    @DisplayName("Part 2")
    fun part2(input: String) = assertEquals(241861950, Day01().part2(input))

    @Test
    @DisplayName("Part 2 - Solution")
    fun part2Solution() = assertEquals(274879808, Day01().part2())
}
