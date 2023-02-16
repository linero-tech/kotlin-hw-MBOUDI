package lms_127

fun task1(): String {
    val countryName = "Germany"
    val capitalName = "Berlin"
    val currencyName = "Euro"
    val sentence = "The capital of $countryName is $capitalName and its currency is $currencyName"

    return sentence
}
fun main(){
val result = task1()
    println(result)
}