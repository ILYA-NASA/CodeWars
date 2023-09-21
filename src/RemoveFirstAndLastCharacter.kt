fun removeChar(str: String) = str.substring(1, str.lastIndex)

fun main() {
    println(removeChar("eloquent"))
    println(removeChar("country"))
    println(removeChar("person"))
    println(removeChar("place"))
}
