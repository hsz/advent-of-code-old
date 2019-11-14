package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Day 1")
class Day01Test {
    @Test
    fun `Part 1`() {
        val day = Day01()

        assertThat(day.part1("")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(0)
    }

    @Test
    fun `Part 2`() {
        val day = Day01()

        assertThat(day.part2("")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(0)
    }
}
