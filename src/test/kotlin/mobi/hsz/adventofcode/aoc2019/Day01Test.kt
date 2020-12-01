package mobi.hsz.adventofcode.aoc2019

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 1: The Tyranny of the Rocket Equation")
class Day01Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day01()

        assertEquals(day.part1("12"), 2)
        assertEquals(day.part1("14"), 2)
        assertEquals(day.part1("1969"), 654)
        assertEquals(day.part1("100756"), 33583)

        assertEquals(day.part1(), 3481005)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day01()

        assertEquals(day.part2("14"), 2)
        assertEquals(day.part2("1969"), 966)
        assertEquals(day.part2("100756"), 50346)

        assertEquals(day.part2(), 5218616)
    }
}
