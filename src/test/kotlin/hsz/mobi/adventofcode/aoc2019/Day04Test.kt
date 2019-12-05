package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day04Test {
    @Test
    fun `Part 1`() {
        val day = Day04()

        assertThat(day.part1("111111-111111")).isEqualTo(1)
        assertThat(day.part1("223450-223450")).isEqualTo(0)
        assertThat(day.part1("123789-123789")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(1246)
    }

    @Test
    fun `Part 2`() {
        val day = Day04()

        assertThat(day.part2("112233-112233")).isEqualTo(1)
        assertThat(day.part2("123444-123444")).isEqualTo(0)
        assertThat(day.part2("111122-111122")).isEqualTo(1)

        assertThat(day.part2()).isEqualTo(814)
    }
}
