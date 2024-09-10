fun main() {
    val number = readln().toInt()
    val m = listOf(2, 3, 5, 6)

    for (i in m.indices)
        if ((number % m[i]) == 0)
            println("Divided by ${m[i]} ")
}