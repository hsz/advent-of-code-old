package hsz.mobi.adventofcode

object Utils {
    fun <K, V> mapper(defaultValue: V, vararg mapping: Pair<K, V>): (key: K) -> V =
        { key -> mapOf(*mapping).getOrDefault(key, defaultValue) }

    fun generateUntil(test: (x: Int) -> Boolean): Int {
        var i = 1
        while (test(i)) {
            i++
        };
        return i
    }
}
