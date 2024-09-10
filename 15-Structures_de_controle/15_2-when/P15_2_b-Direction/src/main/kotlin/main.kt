fun main() {
    println("Choose a direction between 0 and 4 : ")

    val direction = readln().toInt()

    when (direction) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move to left")
        4 -> println("move to right")
        0 -> println("do not move")
        else -> println("error")
    }
}
