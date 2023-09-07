fun loveFun(flowerA: Int, flowerB: Int) = (flowerA + flowerB) % 2 != 0

fun main() {
    println(loveFun(1, 4))
    println(loveFun(2, 2))
    println(loveFun(0, 1))
    println(loveFun(0, 0))
}
