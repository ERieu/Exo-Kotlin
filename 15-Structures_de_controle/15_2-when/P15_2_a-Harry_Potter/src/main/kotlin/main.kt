fun main() {
    println("What house do you want to know the traits of ?")

    var hogwarts_house = readln()
    hogwarts_house = hogwarts_house.lowercase()

    when (hogwarts_house) {
        "gryffindor" -> println("The trait that characterize Gryffindor is bravery.")
        "hufflepuff" -> println("The trait that characterize Hufflepuff is loyalty.")
        "slytherin" -> println("The trait that characterize Slytherin is cunning.")
        "ravenclaw" -> println("The trait that characterize Ravenclaw is intellect.")
        else -> println("This house doesn't exist")
    }
}
