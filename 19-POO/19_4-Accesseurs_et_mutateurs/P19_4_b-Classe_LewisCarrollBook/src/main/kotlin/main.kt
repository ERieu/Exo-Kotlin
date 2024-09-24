class LewisCarrollBook {
    var name: String = ""
    get() {
        return field
    }
        set(value) =
}

fun main() {
//    val alicesAdventuresInWonderland = LewisCarrollBook()
//    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"
//
//    println(alicesAdventuresInWonderland.author)
//    alicesAdventuresInWonderland.price = 10

    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
}