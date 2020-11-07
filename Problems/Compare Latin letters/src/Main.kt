import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val first = scanner.next().first()
    val second = scanner.next().first()
    
    print(first.toLowerCase() == second.toLowerCase())
}