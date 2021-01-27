

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fact(BigInteger("6000"), BigInteger.ONE))
}

fun fact(num: BigInteger, result: BigInteger): BigInteger {
    return if (num == BigInteger.ZERO) {
        result
    } else {
        num * fact(num - BigInteger.ONE, num * result);
    }
}