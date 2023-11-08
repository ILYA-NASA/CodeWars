fun isLeapYear(year: Int) = year % 4 == 0 && year % 100 != 0 || year % 400 == 0

fun main() {
    println(isLeapYear(2020))
    println(isLeapYear(2000))
    println(isLeapYear(2015))
    println(isLeapYear(2100))
}
