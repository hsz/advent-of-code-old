package mobi.hsz.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 5: Doesn't He Have Intern-Elves For This?")
class Day05Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day05()

        assertThat(day.part1("ugknbfddgicrmopn")).isEqualTo(1)
        assertThat(day.part1("aaa")).isEqualTo(1)
        assertThat(day.part1("jchzalrnumimnmhp")).isEqualTo(0)
        assertThat(day.part1("haegwjzuvuyypxyu")).isEqualTo(0)
        assertThat(day.part1("dvszwmarrgswjxmb")).isEqualTo(0)

        assertThat(day.part1()).isEqualTo(258)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day05()

        assertThat(day.part2("qjhvhtzxzqqjkmpb")).isEqualTo(1)
        assertThat(day.part2("xxyxx")).isEqualTo(1)
        assertThat(day.part2("uurcxstgmygtbstg")).isEqualTo(0)
        assertThat(day.part2("ieodomkazucvgmuy")).isEqualTo(0)

        assertThat(day.part2()).isEqualTo(53)
    }
}
