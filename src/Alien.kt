import javax.naming.Context

fun main(args: Array<String>) {
    val human = object : Human {
        override fun think() {
            println("Think")
        }

        override fun breakThink() {
            TODO("Not yet implemented")
        }

    }

    human.think()
}

interface Human {
    fun think()
    fun breakThink()
}

