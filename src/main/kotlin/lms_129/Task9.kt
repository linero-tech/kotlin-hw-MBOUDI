package lms_129

fun task9(temperature: String): String {
    val regex = Regex("(\\-?\\d+)([CF])", RegexOption.IGNORE_CASE)
    val result = regex.find(temperature)?.let {
        val (value, unit) = it.destructured
        "${if (unit.equals("C", ignoreCase = true)) value.toInt() * 9 / 5 + 32 else (value.toInt() - 32) * 5 / 9}${if (unit.equals("C", ignoreCase = true)) "F" else "C"}"
    } ?: "Invalid temperature format"
    return result
}

fun main() {
    println(task9("50F"))
    println(task9("-23f"))
    println(task9("5c"))
}
