package mobi.hsz.adventofcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest

open class DayTest(val day: Day) {

    fun test(
        function: Function1<String, Int>,
        answer: Int,
        data: Collection<Pair<String, Int>> = emptyList(),
        custom: Collection<Pair<Int, Int>> = emptyList()
    ) =
        data.mapIndexed { index, (testInput, expected) ->
            DynamicTest.dynamicTest("Test case #${index + 1}") {
                Assertions.assertEquals(expected, function(testInput.trimIndent()))
            }
        } +
            custom.mapIndexed { index, (testValue, expected) ->
                DynamicTest.dynamicTest("Test case #${index + 1 + data.size}") {
                    Assertions.assertEquals(expected, testValue)
                }
            } +
            DynamicTest.dynamicTest("Solution") {
                Assertions.assertEquals(answer, function(day.input))
            }
}
