package lms_127

fun task1(): String {
    val country = "Germany"
    val capital = "Berlin"
    val currency = "Euro"

    return "Country: $country\nCapital: $capital\nCurrency: $currency"
}

fun main() {
    val result = task1()
    println("1.${result.split("\n")[0]}")
    println("2.${result.split("\n")[1]}")
    println("3.${result.split("\n")[2]}")
}