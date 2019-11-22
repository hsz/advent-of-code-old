package hsz.mobi.adventofcode

internal object Resources {
    fun asString(fileName: String) = Resources.javaClass.classLoader.getResource(fileName)?.readText().orEmpty().trim()
}
