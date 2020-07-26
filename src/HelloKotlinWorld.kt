import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    try {
        throw Exception("try ex")
    } catch (e: Exception) {
        println(e)
    }
    finally {
        println("in finally");
    }
}

