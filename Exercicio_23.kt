package funcoes

import kotlin.math.min

fun main(args: Array<String>) {
    print("O menor valor é ${min(3, 4)}")
}
fun main(a: Int, b: Int): Int {
    return if (a < b) a else b
}