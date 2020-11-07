import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val range1 = scanner.nextInt()..scanner.nextInt()
    val range2 = scanner.nextInt()..scanner.nextInt()
    val numberToCheck = scanner.nextInt()
    
    print(numberToCheck in range1 || numberToCheck in range2)
}