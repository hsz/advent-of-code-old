package mobi.hsz.adventofcode.aoc2020

import mobi.hsz.adventofcode.DayTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestFactory

@DisplayName("Advent of Code 2019, Day 3: Toboggan Trajectory")
class Day0Test : DayTest(Day03()) {

    @TestFactory
    @DisplayName("Part 1")
    fun part1() = test(
        function = day::part1,
        answer = 259,
        data = listOf(
            """
                ..##.......
                #...#...#..
                .#....#..#.
                ..#.#...#.#
                .#...##..#.
                ..#.##.....
                .#.#.#....#
                .#........#
                #.##...#...
                #...##....#
                .#..#...#.#
            """ to 7
        )
    )

    @TestFactory
    @DisplayName("Part 2")
    fun part2() = test(
        function = day::part2,
        answer = 2224913600,
        data = listOf(
            """
                ..##.......
                #...#...#..
                .#....#..#.
                ..#.#...#.#
                .#...##..#.
                ..#.##.....
                .#.#.#....#
                .#........#
                #.##...#...
                #...##....#
                .#..#...#.#
            """ to 336L
        )
    )
}
