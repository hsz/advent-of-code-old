package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Advent of Code 2019, Day 3: Crossed Wires")
class Day03Test {
    @Test
    @DisplayName("Part 1")
    fun part1() {
        val day = Day03()

        assertThat(
            day.part1(
                "R8,U5,L5,D3\n" +
                    "U7,R6,D4,L4"
            )
        ).isEqualTo(6)
        assertThat(
            day.part1(
                "R75,D30,R83,U83,L12,D49,R71,U7,L72\n" +
                    "U62,R66,U55,R34,D71,R55,D58,R83"
            )
        ).isEqualTo(159)
        assertThat(
            day.part1(
                "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51\n" +
                    "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
            )
        ).isEqualTo(135)

        assertThat(day.part1()).isEqualTo(258)
    }

    @Test
    @DisplayName("Part 2")
    fun part2() {
        val day = Day03()

        assertThat(
            day.part2(
                "R8,U5,L5,D3\n" +
                    "U7,R6,D4,L4"
            )
        ).isEqualTo(30)
        assertThat(
            day.part2(
                "R75,D30,R83,U83,L12,D49,R71,U7,L72\n" +
                    "U62,R66,U55,R34,D71,R55,D58,R83"
            )
        ).isEqualTo(610)
        assertThat(
            day.part2(
                "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51\n" +
                    "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
            )
        ).isEqualTo(410)

        assertThat(day.part2()).isEqualTo(12304)
    }
}
