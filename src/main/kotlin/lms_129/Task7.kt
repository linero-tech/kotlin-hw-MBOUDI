package lms_129

fun task7(a: Int, b: Int): Int {
    var result = 1
    for (i in 1..b) {
        result *= a
    }
    return result 
}
fun main (){
    println(task7(a = 2, b = 3))
    println(task7(a = 0, b = 0))
    println(task7(a = 3, b = 3))
}