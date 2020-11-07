import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    var number = scanner.nextInt()
    
    while (number != 0) {
        sum += number
        number = scanner.nextInt()
    }
    
    print(sum)
}