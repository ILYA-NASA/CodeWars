fun getMiddle(word: String): String {
    return if (word.length % 2 == 0) word[word.length / 2 - 1] + word[word.length / 2].toString()
    else word[word.length / 2].toString()
}

fun main() {
    println(getMiddle("test"))
    println(getMiddle("middle"))
    println(getMiddle("testing"))
    println(getMiddle("A"))
}
