fun tip(bill: Int, percentage: Int = 10): Int {
    // TODO
    val result = bill / 100 * percentage
    return result
}

fun main() {
    println(tip(100))
    println(tip(100, 5))
}