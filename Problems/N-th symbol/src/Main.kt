import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val string = scanner.nextLine()
    val index = scanner.nextLine().toInt()
    
    print("Symbol # $index of the string \"$string\" is \'${string[index - 1]}\'")
}