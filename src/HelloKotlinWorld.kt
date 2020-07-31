import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    val b = B()
    b.fun1()
    println(b.fun1(5))
    b.a()

}

interface Inter1{
    fun a()
}

abstract class A : Inter1 {
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

    override fun a() {
        println("Inside a interface")
    }

    fun fun1(a :Int) : Int
    {
        return a
    }
}