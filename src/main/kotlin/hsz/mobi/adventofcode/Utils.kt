package hsz.mobi.adventofcode

object Utils {
    fun <K, V> mapper(defaultValue: V, vararg mapping: Pair<K, V>): (K) -> V =
        { key -> mapOf(*mapping).getOrDefault(key, defaultValue) }

    tailrec fun generateUntil(i: Int = 1, test: (Int) -> Boolean): Int =
        if (test(i)) generateUntil(i + 1, test) else i
}
