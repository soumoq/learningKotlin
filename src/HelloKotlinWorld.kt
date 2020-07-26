
import java.util.*

fun main(args: Array<String>) {
    println(name(21))
}

@JvmOverloads
fun name(age:Int , stClass: Int = 11):String{
    return "Soumo $age"
}