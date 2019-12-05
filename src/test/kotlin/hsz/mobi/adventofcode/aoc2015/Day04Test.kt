package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 4: The Ideal Stocking Stuffer")
class Day04Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day04()

        assertThat(day.part1("abcdef")).isEqualTo(609043)
        assertThat(day.part1("pqrstuv")).isEqualTo(1048970)

        assertThat(day.part1()).isEqualTo(254575)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day04()

        assertThat(day.part2()).isEqualTo(1038736)
    }
}
