import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    var b = B()
}

abstract class A {
    init {
        println("A")
    }
}

class B : A()
{
    init {
        println("B")
    }
}