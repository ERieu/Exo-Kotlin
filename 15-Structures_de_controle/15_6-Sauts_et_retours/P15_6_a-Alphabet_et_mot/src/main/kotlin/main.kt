fun main() {
    val word = readLine()!!.lowercase()
    val alphabet = ('a'..'z').toSet()
    val wordLetters = word.toSet()
    val unusedLetters = alphabet - wordLetters

    println("Unused letters:")

    for (letter in unusedLetters) {
        if (!"hello".contains(letter)) {
            print(letter)
        }
    }
}