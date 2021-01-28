import java.util.*

fun main(args: Array<String>) {
    val list = ArrayList<Int>()
    list.add(5)
    list.add(2)
    list.add(5)
    list.add(6)

    list.forEach { println(it) }

    println()
    println()

    println( list.filter { it % 2 == 0 })
}
