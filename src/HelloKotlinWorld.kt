import java.lang.*
import java.util.*

fun main(args: Array<String>) {
    var th = ImplementThread()
    th.start()
    var th1 = Thread(ThreadRunnable())
    th1.start()
}

class ImplementThread : Thread() {
    override fun run() {
        try {
            println("Inside run")
            sleep(2000);
            println("End run")
        } catch (e: Exception) {
            println(e)
        }

    }
}

class ThreadRunnable : Runnable {
    override fun run() {

        try {
            println("Inside runnable run")
            Thread.sleep(1000);
            println("End runnable run")
        } catch (e: Exception) {
            println(e)
        }

    }

}