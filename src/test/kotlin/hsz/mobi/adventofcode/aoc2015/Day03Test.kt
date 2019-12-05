package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 3: Perfectly Spherical Houses in a Vacuum")
class Day03Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day03()

        assertThat(day.part1(">")).isEqualTo(2)
        assertThat(day.part1("^>v<")).isEqualTo(4)
        assertThat(day.part1("^v^v^v^v^v")).isEqualTo(2)

        assertThat(day.part1()).isEqualTo(2572)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day03()

        assertThat(day.part2("^v")).isEqualTo(3)
        assertThat(day.part2("^>v<")).isEqualTo(3)
        assertThat(day.part2("^v^v^v^v^v")).isEqualTo(11)

        assertThat(day.part2()).isEqualTo(2631)
    }
}
