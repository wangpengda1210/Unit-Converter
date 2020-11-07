import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val firstNumber = scanner.nextLong()
    val operator = scanner.next()
    val secondNumber = scanner.nextLong()
    
    print(when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> {
            if (secondNumber == 0L) "Division by 0!"
            else firstNumber / secondNumber
        }
        else -> "Unknown operator"
    })
}