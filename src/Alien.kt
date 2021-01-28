fun main(args: Array<String>) {
    var l1 = Laptop("dell", 2000)
    var l2 = Laptop("dell", 2000)
    var l3 = l1.copy();
    println(l2 == l3)

}

data class Laptop(val name: String, val price: Int) {
    fun show() {
        println("Show")
    }

}