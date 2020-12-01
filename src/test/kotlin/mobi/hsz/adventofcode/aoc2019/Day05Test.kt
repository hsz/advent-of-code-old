package mobi.hsz.adventofcode.aoc2019

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 5: Sunny with a Chance of Asteroids")
class Day05Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day05()

        assertEquals(day.part1(), 6745903)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day05()

        assertEquals(day.part2(), 9168267)
    }
}
