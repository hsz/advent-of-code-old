package mobi.hsz.adventofcode

import java.math.BigInteger
import java.security.MessageDigest

object Utils {
    fun <K, V> mapper(defaultValue: V, vararg mapping: Pair<K, V>): (K) -> V =
        { key -> mapOf(*mapping).getOrDefault(key, defaultValue) }

    tailrec fun generateUntil(i: Int = 1, test: (Int) -> Boolean): Int =
        if (test(i)) generateUntil(i + 1, test) else i
}

/**
 * Creates a sequence with a permutation of the two provided ranges.
 */
fun <T> Pair<Iterable<T>, Iterable<T>>.permutation() = sequence {
    this@permutation.first.forEach { x ->
        this@permutation.second.forEach { y ->
            yield(x to y)
        }
    }
}

/**
 * Creates a sequence with a permutation of the provided iterable.
 */
fun <T> Iterable<T>.permutation() = (this to this).permutation()

/**
 * Creates a sequence with a permutation of the two provided ranges.
 */
fun <T> Triple<Iterable<T>, Iterable<T>, Iterable<T>>.permutation3() = sequence {
    this@permutation3.first.forEach { x ->
        this@permutation3.second.forEach { y ->
            this@permutation3.third.forEach { z ->
                yield(Triple(x, y, z))
            }
        }
    }
}

/**
 * Creates a sequence with a permutation of the provided iterable.
 */
fun <T> Iterable<T>.permutation3() = (Triple(this, this, this)).permutation3()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

/**
 * Sums two pairs of integer values.
 */
operator fun Pair<Int, Int>.plus(p: Pair<Int, Int>) = first + p.first to second + p.second
