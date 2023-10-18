fun countPositivesSumNegatives(input : Array<Int>?) =
    if (input.isNullOrEmpty())
        arrayOf()
    else
        arrayOf(input.count { it > 0 }, input.filter{ it < 0 }.sum())

fun main() {
    println(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)).joinToString())
    println(countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)).joinToString())
    println(countPositivesSumNegatives(arrayOf()).joinToString())
    println(countPositivesSumNegatives(null).joinToString())
}
