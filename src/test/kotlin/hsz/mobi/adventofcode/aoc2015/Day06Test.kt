package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 06: Probably a Fire Hazard")
class Day06Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day06()

        assertThat(day.part1("turn on 0,0 through 999,999")).isEqualTo(1000000)
        assertThat(day.part1("toggle 0,0 through 999,0")).isEqualTo(1000)
        assertThat(day.part1("turn off 499,499 through 500,500")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(543903)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day06()

        assertThat(day.part2("turn on 0,0 through 0,0")).isEqualTo(1)
        assertThat(day.part2("toggle 0,0 through 999,999")).isEqualTo(2000000)

        assertThat(day.part2()).isEqualTo(14687245)
    }
}
