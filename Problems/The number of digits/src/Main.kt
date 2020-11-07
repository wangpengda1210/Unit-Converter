import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    print(when(scanner.next().length) {
        1 -> 1
        2 -> 2
        3 -> 3
        4 -> 4
        else -> "Not supported"
    })
}