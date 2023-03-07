package lms_129

fun task10(password: String): Boolean {

    val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#\$])[A-Za-z\\d@#\$]{6,10}$")
    return regex.matches(password)
}
fun main (){
    val password = "Kotlin123@"
    val result = if (task10(password)) "valid" else "invalid"
    println("password is $result")

}