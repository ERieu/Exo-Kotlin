fun isVowel(letter1: Char):Boolean {
    letter1.lowercase()
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    if (vowels.contains(letter1)) {
        return true
    }
    else {
        return false
    }
}
    

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
