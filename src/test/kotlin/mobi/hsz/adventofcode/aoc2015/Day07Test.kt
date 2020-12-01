package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 7: Some Assembly Required")
class Day07Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day07()

//        assertEquals(day.part1("123 -> a"), 123)
        assertEquals(day.part1(""), 0)
        assertEquals(day.part1(""), 0)
        assertEquals(day.part1(""), 0)

        assertEquals(day.part1(), 0)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day07()

        assertEquals(day.part2(""), 0)

        assertEquals(day.part2(), 0)
    }
}
