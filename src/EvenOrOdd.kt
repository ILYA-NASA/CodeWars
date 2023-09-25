fun evenOrOdd(number: Int) = if (number % 2 == 0) "Even" else "Odd"

fun main() {
    println(evenOrOdd(2))
    println(evenOrOdd(0))
    println(evenOrOdd(7))
    println(evenOrOdd(1))
}
