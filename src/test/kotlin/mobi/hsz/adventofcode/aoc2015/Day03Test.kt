package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 3: Perfectly Spherical Houses in a Vacuum")
class Day03Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day03()

        assertEquals(day.part1(">"), 2)
        assertEquals(day.part1("^>v<"), 4)
        assertEquals(day.part1("^v^v^v^v^v"), 2)

        assertEquals(day.part1(), 2572)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day03()

        assertEquals(day.part2("^v"), 3)
        assertEquals(day.part2("^>v<"), 3)
        assertEquals(day.part2("^v^v^v^v^v"), 11)

        assertEquals(day.part2(), 2631)
    }
}
