package mobi.hsz.adventofcode.aoc2019

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 4: Secure Container")
class Day04Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day04()

        assertEquals(day.part1("111111-111111"), 1)
        assertEquals(day.part1("223450-223450"), 0)
        assertEquals(day.part1("123789-123789"), 0)

        assertEquals(day.part1(), 1246)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day04()

        assertEquals(day.part2("112233-112233"), 1)
        assertEquals(day.part2("123444-123444"), 0)
        assertEquals(day.part2("111122-111122"), 1)

        assertEquals(day.part2(), 814)
    }
}
