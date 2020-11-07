import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var result = ""
    result += scanner.next().first().isDigit().toString() + "\\"
    result += scanner.next().first().isDigit().toString() + "\\"
    result += scanner.next().first().isDigit().toString() + "\\"
    result += scanner.next().first().isDigit().toString()
    
    print(result)
}