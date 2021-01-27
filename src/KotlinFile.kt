import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val a1 = Alien();
    a1.skills = "java"
    a1.show()

    val a2 = Alien();
    a2.skills = "sql"
    a2.show()

    val a3 = a1 + a2
    a3.show()
}

infix operator fun Alien.plus(a: Alien): Alien {
    var newAlien = Alien()
    newAlien.skills = this.skills + " : " + a.skills
    return newAlien
}
