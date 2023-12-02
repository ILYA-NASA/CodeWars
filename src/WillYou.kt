fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean) = young and beautiful != loved || young and beautiful == !loved

fun main() {
    println(willYou(true, true, true)) //false
    println(willYou(true, false, true)) //true
    println(willYou(false, false, false)) //false
    println(willYou(false, false, true)) //true
}
