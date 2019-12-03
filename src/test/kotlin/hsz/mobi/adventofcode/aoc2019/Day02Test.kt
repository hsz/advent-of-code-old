package hsz.mobi.adventofcode.aoc2019

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day02Test {
    @Test
    fun `Part 1`() {
        val day = Day02()

        assertThat(day.process("1,0,0,0,99").first()).isEqualTo(2)
        assertThat(day.process("2,3,0,3,99").first()).isEqualTo(2)
        assertThat(day.process("2,4,4,5,99,0").first()).isEqualTo(2)
        assertThat(day.process("1,1,1,4,99,5,6,0,99").first()).isEqualTo(30)

        assertThat(day.part1()).isEqualTo(3562624)
    }

    @Test
    fun `Part 2`() {
        val day = Day02()

        assertThat(day.part2()).isEqualTo(8298)
    }
}
