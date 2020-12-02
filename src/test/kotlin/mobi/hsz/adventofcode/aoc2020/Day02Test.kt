package mobi.hsz.adventofcode.aoc2020

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("Advent of Code 2020, Day 2: Password Philosophy")
class Day02Test {

    @ParameterizedTest
    @ValueSource(
        strings = [
            "1-3 a: abcde\n1-3 b: cdefg\n2-9 c: ccccccccc",
        ]
    )
    @DisplayName("Part 1")
    fun part1(input: String) = assertEquals(2, Day02().part1(input))

    @Test
    @DisplayName("Part 1 - Solution")
    fun part1Solution() = assertEquals(398, Day02().part1())

    @ParameterizedTest
    @ValueSource(
        strings = [
            "1-3 a: abcde\n1-3 b: cdefg\n2-9 c: ccccccccc",
        ]
    )
    @DisplayName("Part 2")
    fun part2(input: String) = assertEquals(1, Day02().part2(input))

    @Test
    @DisplayName("Part 2 - Solution")
    fun part2Solution() = assertEquals(562, Day02().part2())
}
