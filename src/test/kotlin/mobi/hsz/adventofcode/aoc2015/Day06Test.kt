package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 06: Probably a Fire Hazard")
class Day06Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day06()

        assertEquals(day.part1("turn on 0,0 through 999,999"), 1000000)
        assertEquals(day.part1("toggle 0,0 through 999,0"), 1000)
        assertEquals(day.part1("turn off 499,499 through 500,500"), 0)

        assertEquals(day.part1(), 543903)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day06()

        assertEquals(day.part2("turn on 0,0 through 0,0"), 1)
        assertEquals(day.part2("toggle 0,0 through 999,999"), 2000000)

        assertEquals(day.part2(), 14687245)
    }
}
