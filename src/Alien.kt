import javax.naming.Context

fun main(args: Array<String>) {
    var laptop = Laptop("Apple", 3000000)
    Shop.laptop.add(laptop)
    Shop.laptop.add(Laptop("dell", 80000))
    Shop.laptop.add(Laptop("HP", 3000))
    Shop.show(laptop)

}

data class Laptop(val name: String, val price: Int)

object Shop {
    var laptop = arrayListOf<Laptop>()

    fun show(laptop: Laptop) {
        println(laptop)
    }

}