import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextLine()
    val second = scanner.nextLine()
    val third = scanner.nextLine()
    val separator = scanner.nextLine()
    
    if (separator == "NO SEPARATOR") print(concatenate(first, second, third))
    else print(concatenate(first, second, third, separator))
}

fun concatenate(first: String, second: String, third: String, separator: String = " "): String {
    return "$first$separator$second$separator$third"
}