fun main() {
    val input = readLine()!!
    // write code here
    when {
        input.isEmpty() -> print(input)
        input.first() == 'i' -> print(input.drop(1).toInt() + 1)
        input.first() == 's' -> print(input.drop(1).reversed())
        else -> print(input)
    }
}