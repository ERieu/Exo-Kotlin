fun main() {
    val n = readln().toInt()
    var numbers = 0
    var number = 100

    for (i in 0..n) {
        numbers = (1..10).random()
        println(numbers)
        if (number > numbers) {
            number = numbers
        }
    }
    println("The lowest number is $number.")
}
