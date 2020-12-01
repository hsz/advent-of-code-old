package mobi.hsz.adventofcode.aoc2015

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Advent of Code 2015, Day 5: Doesn't He Have Intern-Elves For This?")
class Day05Test {

    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day05()

        assertEquals(day.part1("ugknbfddgicrmopn"), 1)
        assertEquals(day.part1("aaa"), 1)
        assertEquals(day.part1("jchzalrnumimnmhp"), 0)
        assertEquals(day.part1("haegwjzuvuyypxyu"), 0)
        assertEquals(day.part1("dvszwmarrgswjxmb"), 0)

        assertEquals(day.part1(), 258)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day05()

        assertEquals(day.part2("qjhvhtzxzqqjkmpb"), 1)
        assertEquals(day.part2("xxyxx"), 1)
        assertEquals(day.part2("uurcxstgmygtbstg"), 0)
        assertEquals(day.part2("ieodomkazucvgmuy"), 0)

        assertEquals(day.part2(), 53)
    }
}
