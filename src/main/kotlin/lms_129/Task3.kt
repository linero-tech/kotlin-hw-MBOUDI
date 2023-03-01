package lms_129

fun task3(number: Int): Int {
    var result = 1
    for (I in 1 .. number) {
        result *= I
    }

    return result
}

fun main () {

    println(task3(number = 5))
    println(task3(number = 3))
    println(task3(number = 9))
}