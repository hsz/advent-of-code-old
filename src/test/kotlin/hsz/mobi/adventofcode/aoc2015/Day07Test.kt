package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day07Test {
    @Test
    fun `Part 1`() {
        val day = Day07()

//        assertThat(day.part1("123 -> a")).isEqualTo(123)
        assertThat(day.part1("")).isEqualTo(0)
        assertThat(day.part1("")).isEqualTo(0)
        assertThat(day.part1("")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(0)
    }

    @Test
    fun `Part 2`() {
        val day = Day07()

        assertThat(day.part2("")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(0)
    }
}
