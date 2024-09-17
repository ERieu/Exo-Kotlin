fun getVolume(length: Int = 1, width: Int = 1, height: Int = 1): Int{
    //TODO
    val result = length * width * height
    return result
}

fun main() {
    println(getVolume(1))
}