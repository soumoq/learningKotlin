import java.util.*

fun main(args: Array<String>) {

    var st = TreeMap<String, Int>()
    st["Soumo"] = 22
    st["Ujjwal"] = 23

    for ((name, age) in st) {
        println("$name : $age")
    }
}

