import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    val b = B()
    b.fun1()
    println(b.fun1(5))

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

    fun fun1(a :Int) : Int
    {
        return a
    }
}