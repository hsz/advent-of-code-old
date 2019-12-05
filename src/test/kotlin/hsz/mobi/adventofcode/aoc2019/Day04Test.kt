package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 4: Secure Container")
class Day04Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day04()

        assertThat(day.part1("111111-111111")).isEqualTo(1)
        assertThat(day.part1("223450-223450")).isEqualTo(0)
        assertThat(day.part1("123789-123789")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(1246)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day04()

        assertThat(day.part2("112233-112233")).isEqualTo(1)
        assertThat(day.part2("123444-123444")).isEqualTo(0)
        assertThat(day.part2("111122-111122")).isEqualTo(1)

        assertThat(day.part2()).isEqualTo(814)
    }
}
