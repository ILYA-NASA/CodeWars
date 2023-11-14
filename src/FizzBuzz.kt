fun fizzBuzz(n: Int): Array<String> {
    val arr = IntArray(n) {it + 1}
    var result = emptyArray<String>()
    arr.forEach {
        result += when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> "$it"
        }
    }
    return result
}

fun main() {
    println(fizzBuzz(5).joinToString())
    println(fizzBuzz(10).joinToString())
}
