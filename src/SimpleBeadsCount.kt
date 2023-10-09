fun countRedBeads(nBlue: Int) = if (nBlue > 1) (nBlue - 1) * 2 else 0

fun main() {
    countRedBeads(0)
    countRedBeads(1)
    countRedBeads(3)
    countRedBeads(5)
}
