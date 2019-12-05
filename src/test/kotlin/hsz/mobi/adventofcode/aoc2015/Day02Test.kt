package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 2: I Was Told There Would Be No Math")
class Day02Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day02()

        assertThat(day.part1("2x3x4")).isEqualTo(58)
        assertThat(day.part1("1x1x10")).isEqualTo(43)

        assertThat(day.part1()).isEqualTo(1586300)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day02()

        assertThat(day.part2("2x3x4")).isEqualTo(34)
        assertThat(day.part2("1x1x10")).isEqualTo(14)

        assertThat(day.part2()).isEqualTo(3737498)
    }
}
