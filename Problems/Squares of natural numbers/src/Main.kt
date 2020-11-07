import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var number = scanner.nextInt()
    var result = ""
    
    while (number != 1) {
        if (number % 2 == 0) number /= 2
        else number = number * 3 + 1
        result += "$number "
    }
    
    print(result)
}