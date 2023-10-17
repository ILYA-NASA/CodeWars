fun catchSignChange(arr: Array<Int>): Int {
    var count = 0
    try {
        var positiveSequence = arr[0] >= 0
        for (i in 1 until arr.size) {
            val currentPositiveElement = arr[i] >= 0
            if (currentPositiveElement != positiveSequence) {
                positiveSequence = currentPositiveElement
                count++
            }
        }
    } catch (e: Exception) {
        count = 0
    }
    return count
}

fun main() {
    println(catchSignChange(arrayOf(1, 3, 4, 5)))
    println(catchSignChange(arrayOf<Int>()))
    println(catchSignChange(arrayOf(1, -3, -4, 0, 5)))
    println(catchSignChange(arrayOf(-47, 84, -30, -11, -5, 74, 77)))
}
