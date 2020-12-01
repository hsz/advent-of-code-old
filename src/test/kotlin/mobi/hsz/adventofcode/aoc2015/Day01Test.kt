package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 1: Not Quite Lisp")
class Day01Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day01()

        assertEquals(day.part1("(())"), 0)
        assertEquals(day.part1("((("), 3)
        assertEquals(day.part1("(()(()("), 3)
        assertEquals(day.part1("))((((("), 3)
        assertEquals(day.part1("())"), -1)
        assertEquals(day.part1("))("), -1)
        assertEquals(day.part1(")))"), -3)
        assertEquals(day.part1(")())())"), -3)

        assertEquals(day.part1(), 280)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day01()

        assertEquals(day.part2(")"), 1)
        assertEquals(day.part2("()())"), 5)

        assertEquals(day.part2(), 1797)
    }
}
