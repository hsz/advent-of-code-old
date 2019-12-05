package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 1: The Tyranny of the Rocket Equation")
class Day01Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day01()

        assertThat(day.part1("12")).isEqualTo(2)
        assertThat(day.part1("14")).isEqualTo(2)
        assertThat(day.part1("1969")).isEqualTo(654)
        assertThat(day.part1("100756")).isEqualTo(33583)

        assertThat(day.part1()).isEqualTo(3481005)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day01()

        assertThat(day.part2("14")).isEqualTo(2)
        assertThat(day.part2("1969")).isEqualTo(966)
        assertThat(day.part2("100756")).isEqualTo(50346)

        assertThat(day.part2()).isEqualTo(5218616)
    }
}
