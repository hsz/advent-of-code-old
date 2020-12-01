package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 2: I Was Told There Would Be No Math")
class Day02Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day02()

        assertEquals(day.part1("2x3x4"), 58)
        assertEquals(day.part1("1x1x10"), 43)

        assertEquals(day.part1(), 1586300)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day02()

        assertEquals(day.part2("2x3x4"), 34)
        assertEquals(day.part2("1x1x10"), 14)

        assertEquals(day.part2(), 3737498)
    }
}
