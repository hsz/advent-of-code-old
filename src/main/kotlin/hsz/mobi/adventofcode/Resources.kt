package hsz.mobi.adventofcode

internal object Resources {
    fun asString(fileName: String): String = Resources.javaClass.classLoader.getResource(fileName)!!.readText().trim()
}
