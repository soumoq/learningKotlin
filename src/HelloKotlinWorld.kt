fun main(args: Array<String>) {
    val hello: Hello = Hello()
    var num1: Int? = null
    var num2: Int = 8

    var res = when (num2) {
        7 -> {
            "seven"
        }
        8 -> {
            var res=num2
            "eight $res"
        }
        else -> {
            "give proper input"
        }
    }
    println("Result is $res")
}

