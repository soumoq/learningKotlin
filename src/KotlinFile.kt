import java.util.*

fun main(args: Array<String>) {
    println(check(2))
}

fun check(a: Int) {
    var num = 16 downTo 5
    for (v in num step 2){
        println(v)
    }
}