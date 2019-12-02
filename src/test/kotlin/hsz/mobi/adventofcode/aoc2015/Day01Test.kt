package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {
    @Test
    fun `Part 1`() {
        val day = Day01()

        assertThat(day.part1("(())")).isEqualTo(0)
        assertThat(day.part1("(((")).isEqualTo(3)
        assertThat(day.part1("(()(()(")).isEqualTo(3)
        assertThat(day.part1("))(((((")).isEqualTo(3)
        assertThat(day.part1("())")).isEqualTo(-1)
        assertThat(day.part1("))(")).isEqualTo(-1)
        assertThat(day.part1(")))")).isEqualTo(-3)
        assertThat(day.part1(")())())")).isEqualTo(-3)

        assertThat(day.part1()).isEqualTo(280)
    }

    @Test
    fun `Part 2`() {
        val day = Day01()

        assertThat(day.part2(")")).isEqualTo(1)
        assertThat(day.part2("()())")).isEqualTo(5)

        assertThat(day.part2()).isEqualTo(1797)
    }
}
