import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val first = scanner.next().first()
    val second = scanner.next().first()
    val third = scanner.next().first()
    print(second == first + 1 && third == second + 1)
}