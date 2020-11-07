import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var maxNumber = 0
    
    repeat(scanner.nextInt()) {
        val currentNumber = scanner.nextInt()
        if (currentNumber > maxNumber && currentNumber % 4 == 0) maxNumber = currentNumber
    }
    
    print(maxNumber)
}