package lms_127

fun task8(sentence: String, character: Char): Int {
    return sentence.count { it == character }
}
fun main () {
    println(task8(sentence = "I cod in KOTLIN", character ='I'))
    println(task8(sentence = "I cod in KOTLIN", character ='i'))
    println(task8(sentence = "I cod in KOTLIN", character ='a'))

}