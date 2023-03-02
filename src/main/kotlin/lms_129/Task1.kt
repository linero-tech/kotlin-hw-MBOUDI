package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 0
    if (a >= b) {
        result = 0
    } else {
        for (i in a .. b){
            result += i
        }
    }
    return result

}
fun main() {
    val a = 5
    val b = 5
    val result = if (a >= b) 0 else (a..b).sum()
    println("The sum of numbers between $a and $b is $result.")
}

