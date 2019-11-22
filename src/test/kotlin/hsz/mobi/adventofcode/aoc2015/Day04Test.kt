package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Day04Test {
    @Test
    fun `Part 1`() {
        val day = Day04()

        assertThat(day.part1("abcdef")).isEqualTo(609043)
        assertThat(day.part1("pqrstuv")).isEqualTo(1048970)

        assertThat(day.part1()).isEqualTo(254575)
    }

    @Test
    fun `Part 2`() {
        val day = Day04()

        assertThat(day.part2()).isEqualTo(1038736)
    }
}
