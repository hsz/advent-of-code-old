package mobi.hsz.adventofcode.aoc2019

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2019, Day 2: 1202 Program Alarm")
class Day02Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day02()

        assertEquals("1,0,0,0,99".intcode().first.first(), 2)
        assertEquals("2,3,0,3,99".intcode().first.first(), 2)
        assertEquals("2,4,4,5,99,0".intcode().first.first(), 2)
        assertEquals("1,1,1,4,99,5,6,0,99".intcode().first.first(), 30)

        assertEquals(day.part1(), 3562624)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day02()

        assertEquals(day.part2(), 8298)
    }
}
