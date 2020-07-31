import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    val a = A(1,2)
}

class A {

    init {
        println("A")
    }

    constructor(a: Int, b: Int){
        println(a+b)
    }

}