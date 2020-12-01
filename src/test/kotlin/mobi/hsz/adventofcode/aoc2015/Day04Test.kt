package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 4: The Ideal Stocking Stuffer")
class Day04Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day04()

        assertEquals(day.part1("abcdef"), 609043)
        assertEquals(day.part1("pqrstuv"), 1048970)

        assertEquals(day.part1(), 254575)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day04()

        assertEquals(day.part2(), 1038736)
    }
}
