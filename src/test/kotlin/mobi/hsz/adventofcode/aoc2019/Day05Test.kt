package mobi.hsz.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 5: Sunny with a Chance of Asteroids")
class Day05Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day05()

        assertThat(day.part1()).isEqualTo(6745903)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day05()

        assertThat(day.part2()).isEqualTo(9168267)
    }
}
