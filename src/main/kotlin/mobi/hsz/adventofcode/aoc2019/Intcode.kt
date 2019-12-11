package mobi.hsz.adventofcode.aoc2019

import mobi.hsz.adventofcode.Utils

val map = Utils.mapper(1, 1 to 4, 2 to 4, 3 to 2, 4 to 2, 5 to 3, 6 to 3, 7 to 4, 8 to 4)

fun String.intcode(noun: Int? = null, verb: Int? = null, input: Int = 0): Pair<List<Int>, List<Int>> =
    split(',').map(String::toInt).toMutableList().apply {
        set(1, noun ?: get(1))
        set(2, verb ?: get(2))
    }.run {
        val output = mutableListOf<Int>()
        var index = 0
        fun value(position: Int, mode: Char) = if (mode == '0') get(get(position)) else get(position)

        while (get(index) != 99) {
            val mode = get(index).toString().padStart(5, '0').take(3).reversed()
            when (get(index) % 10) {
                1 -> {
                    set(get(index + 3), value(index + 1, mode[0]) + value(index + 2, mode[1]))
                    index += 4
                }
                2 -> {
                    set(get(index + 3), value(index + 1, mode[0]) * value(index + 2, mode[1]))
                    index += 4
                }
                3 -> {
                    set(get(index + 1), input)
                    index += 2
                }
                4 -> {
                    output.add(value(index + 1, mode[0]))
                    index += 2
                }
                5 -> index = when {
                    value(index + 1, mode[0]) > 0 -> value(index + 2, mode[1])
                    else -> index + 3
                }
                6 -> index = when {
                    value(index + 1, mode[0]) == 0 -> value(index + 2, mode[1])
                    else -> index + 3
                }
                7 -> {
                    set(
                        get(index + 3), when {
                            value(index + 1, mode[0]) < value(index + 2, mode[1]) -> 1
                            else -> 0
                        }
                    )
                    index += 4
                }
                8 -> {
                    set(
                        get(index + 3), when {
                            value(index + 1, mode[0]) == value(index + 2, mode[1]) -> 1
                            else -> 0
                        }
                    )
                    index += 4
                }
            }
        }

        return this to output
    }
