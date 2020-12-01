package mobi.hsz.adventofcode.aoc2019

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 6: Universal Orbit Map")
class Day06Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day06()

        assertEquals(
            day.part1(
                "COM)B\n" +
                    "B)C\n" +
                    "C)D\n" +
                    "D)E\n" +
                    "E)F\n" +
                    "B)G\n" +
                    "G)H\n" +
                    "D)I\n" +
                    "E)J\n" +
                    "J)K\n" +
                    "K)L"
            ),
            42
        )

        assertEquals(day.part1(), 106065)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day06()

        assertEquals(
            day.part2(
                "COM)B\n" +
                    "B)C\n" +
                    "C)D\n" +
                    "D)E\n" +
                    "E)F\n" +
                    "B)G\n" +
                    "G)H\n" +
                    "D)I\n" +
                    "E)J\n" +
                    "J)K\n" +
                    "K)L\n" +
                    "K)YOU\n" +
                    "I)SAN"
            ),
            4
        )

        assertEquals(day.part2(), 253)
    }
}
