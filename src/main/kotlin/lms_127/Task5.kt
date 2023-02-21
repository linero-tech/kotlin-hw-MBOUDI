package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    val temporary = a
    a = b
    b = temporary

    // Do not erase or change this statement
    return Pair(a, b)
}

 fun main() {
    println(task5(valueForA =1, valueForB = 2))
}
