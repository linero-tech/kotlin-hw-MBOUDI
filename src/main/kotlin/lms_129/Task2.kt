package lms_129

fun task2(number: Int): Boolean {
    val number = (1..100).random()
    var result = true

    if (number <= 1){
        result = false
    }else {
        for (i in 2 until number)
            result = true
    }
    return result
}
fun main (){
    val result = task2(number = 75)
    println(result)
}