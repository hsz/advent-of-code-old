package hsz.mobi.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day05Test {
    @Test
    fun `Part 1`() {
        val day = Day05()

        assertThat(day.part1("ugknbfddgicrmopn")).isEqualTo(1)
        assertThat(day.part1("aaa")).isEqualTo(1)
        assertThat(day.part1("jchzalrnumimnmhp")).isEqualTo(0)
        assertThat(day.part1("haegwjzuvuyypxyu")).isEqualTo(0)
        assertThat(day.part1("dvszwmarrgswjxmb")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(258)
    }

    @Test
    fun `Part 2`() {
        val day = Day05()

        assertThat(day.part2("qjhvhtzxzqqjkmpb")).isEqualTo(1)
        assertThat(day.part2("xxyxx")).isEqualTo(1)
        assertThat(day.part2("uurcxstgmygtbstg")).isEqualTo(0)
        assertThat(day.part2("ieodomkazucvgmuy")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(53)
    }
}
