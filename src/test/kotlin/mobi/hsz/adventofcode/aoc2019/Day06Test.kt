package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 6: Universal Orbit Map")
class Day06Test : DayTest(Day06()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 106065,
        data = listOf(
            """
                COM)B
                B)C
                C)D
                D)E
                E)F
                B)G
                G)H
                D)I
                E)J
                J)K
                K)L
            """ to 42
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 253,
        data = listOf(
            """
                COM)B
                B)C
                C)D
                D)E
                E)F
                B)G
                G)H
                D)I
                E)J
                J)K
                K)L
                K)YOU
                I)SAN
            """ to 4
        )
    )
}
