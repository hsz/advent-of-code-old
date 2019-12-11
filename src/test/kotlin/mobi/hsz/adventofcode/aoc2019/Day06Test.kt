package mobi.hsz.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 6: Universal Orbit Map")
class Day06Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day06()

        assertThat(
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
            )
        ).isEqualTo(42)

        assertThat(day.part1()).isEqualTo(106065)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day06()

        assertThat(
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
            )
        ).isEqualTo(4)

        assertThat(day.part2()).isEqualTo(253)
    }
}
