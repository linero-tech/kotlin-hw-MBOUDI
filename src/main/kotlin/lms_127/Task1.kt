package lms_127

fun task1(): String {
    val country="Germany"
    val capital="Berlin"
    val currency="Euro"
    val sentence = " The capital of $country is $capital and its currency is $currency "

    return sentence
}
fun main(){
val result = task1()
    println(result)
}