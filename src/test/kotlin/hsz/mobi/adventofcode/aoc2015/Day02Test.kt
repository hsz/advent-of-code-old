package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Day02Test {
    @Test
    fun `Part 1`() {
        val day = Day02()

        assertThat(day.part1("2x3x4")).isEqualTo(58)
        assertThat(day.part1("1x1x10")).isEqualTo(43)

        assertThat(day.part1()).isEqualTo(1586300)
    }

    @Test
    fun `Part 2`() {
        val day = Day02()

        assertThat(day.part2("2x3x4")).isEqualTo(34)
        assertThat(day.part2("1x1x10")).isEqualTo(14)

        assertThat(day.part2()).isEqualTo(3737498)
    }
}
