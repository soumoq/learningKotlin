import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    var th = ImplementThread()
    th.start()
    var rTh = ThreadRunnable()
    rTh.run();
}

class ImplementThread : Thread()
{
    override fun run() {
        println("Inside run")
        Thread.sleep(2000);
        println("End run")
    }
}

class ThreadRunnable : Runnable
{
    override fun run() {
        println("Inside runnable run")
        Thread.sleep(1000);
        println("End runnable run")
    }

}