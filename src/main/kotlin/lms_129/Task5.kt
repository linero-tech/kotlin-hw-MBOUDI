package lms_129

fun task5(sentence: String): Int {
var result = 0
    for (char in sentence){
        result++
    }
    return result
}
fun main (){
    val sentence = "My teacher is smart in Kotlin"
    val result = task5(sentence)
    println("the number of character in the sentence is $result")
}