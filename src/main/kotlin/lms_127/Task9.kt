package lms_127

fun task9(sentence: String, character: Char): Boolean {
    return sentence.contains(character)
}
fun main (){
    println(task9(sentence = "I code In KOTLIN", character ='I'))
    println(task9(sentence = "I code In KOTLIN", character ='O'))
    println(task9(sentence = "I code In KOTLIN", character ='m'))
}