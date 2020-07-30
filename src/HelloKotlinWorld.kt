import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    var th = ImplementThread()
    th.start()
}

class ImplementThread : Thread()
{
    override fun run() {
        println("Inside run")
        Thread.sleep(2000);
        println("End run")
    }
}