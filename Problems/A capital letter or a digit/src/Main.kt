import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val char = scanner.next().first()
    print(char.isUpperCase() || char in '1'..'9')
}