import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val color = input.next()
    var found = false
    for (rainbow in Rainbow.values()) {
        if (color.toUpperCase() == rainbow.name) {
            found = true
            break
        }
    }
    print(found)
}

enum class Rainbow(value: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet")
}