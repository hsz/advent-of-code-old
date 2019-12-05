package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 7: Some Assembly Required")
class Day07Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day07()

//        assertThat(day.part1("123 -> a")).isEqualTo(123)
        assertThat(day.part1("")).isEqualTo(0)
        assertThat(day.part1("")).isEqualTo(0)
        assertThat(day.part1("")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(0)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day07()

        assertThat(day.part2("")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(0)
    }
}
