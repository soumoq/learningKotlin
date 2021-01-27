fun main(args: Array<String>) {
    var z = Z("abcd")
    println(z.returnString())

}

class Z {
    var s: String? = null

    constructor() {
        println("Default")
    }

    constructor(s: String) {
        this.s = s
    }

    constructor(i: Int) {
        println("Int")
    }

    fun returnString(): String? {
        return s;
    }
}