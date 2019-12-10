package mobi.hsz.adventofcode.aoc2015

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2015, Day 1: Not Quite Lisp")
class Day01Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
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
    @DisplayName("Part 2")
    fun part2() {
        val day = Day01()

        assertThat(day.part2(")")).isEqualTo(1)
        assertThat(day.part2("()())")).isEqualTo(5)

        assertThat(day.part2()).isEqualTo(1797)
    }
}
