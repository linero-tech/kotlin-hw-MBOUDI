package lms_129

fun task6(number: Int): Int {
    var reversedNumber = 0

    var num = number
    while ( num > 0){
        reversedNumber = reversedNumber * 10 + num % 10
        num /=10
    }
    return reversedNumber
}
fun main() {
    var number = 678
    var reversedNumber = 0

    while (number > 0) {
        reversedNumber = reversedNumber * 10 + number % 10
        number /= 10
    }

    println(reversedNumber)
}