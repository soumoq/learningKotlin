import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    var b = B()
    b.fun1()

}

abstract class A {
    init {
        println("A")
    }
    abstract fun fun1()
}

class B : A()
{
    init {
        println("B")
    }
    override fun fun1()
    {
        println("fun 1")
    }
}