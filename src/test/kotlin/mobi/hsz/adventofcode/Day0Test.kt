package mobi.hsz.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 0:")
class Day0Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day0()

        assertThat(day.part1("")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(0)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day0()

        assertThat(day.part2("")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(0)
    }
}
