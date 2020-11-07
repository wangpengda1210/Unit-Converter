import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = 0
    var number = scanner.nextInt()
    
    while (number != 0) {
        if (number > max) max = number
        number = scanner.nextInt()
    }
    
    print(max)
}