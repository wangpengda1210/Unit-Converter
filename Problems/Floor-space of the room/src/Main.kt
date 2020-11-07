import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    print(when (scanner.nextLine()) {
        "rectangle" -> scanner.nextLine().toDouble() * scanner.nextLine().toDouble()
        "circle" -> Math.pow(scanner.nextLine().toDouble(), 2.0) * 3.14
        "triangle" -> {
            val first = scanner.nextLine().toDouble()
            val second = scanner.nextLine().toDouble()
            val third = scanner.nextLine().toDouble()
            val s = 0.5 * (first + second + third)
            Math.sqrt(s * (s - first) * (s - second) * (s - third))
        }
        else -> "Not supported"
    })
}