package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 3: Crossed Wires")
class Day03Test : DayTest(Day03()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 258,
        data = listOf(
            """
                R8,U5,L5,D3
                U7,R6,D4,L4
            """ to 6,
            """
                R75,D30,R83,U83,L12,D49,R71,U7,L72
                U62,R66,U55,R34,D71,R55,D58,R83
            """ to 159,
            """
                R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51
                U98,R91,D20,R16,D67,R40,U7,R15,U6,R7
            """ to 135,
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 12304,
        data = listOf(
            """
                R8,U5,L5,D3
                U7,R6,D4,L4
            """ to 30,
            """
                R75,D30,R83,U83,L12,D49,R71,U7,L72
                U62,R66,U55,R34,D71,R55,D58,R83
            """ to 610,
            """
                R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51
                U98,R91,D20,R16,D67,R40,U7,R15,U6,R7
            """ to 410,
        )
    )
}
