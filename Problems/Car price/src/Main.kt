import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val attribute = scanner.nextLine()
    val value = scanner.nextInt()
    
    print(when (attribute) {
        "old" -> calculatePrice(value)
        "passed" -> calculatePrice(kilometers = value)
        "speed" -> calculatePrice(maximumSpeed = value)
        "auto" -> calculatePrice(hasAutomaticTransmission = value)
        else -> calculatePrice()
    })
}

fun calculatePrice(old: Int = 5, kilometers: Int = 100000,
                   maximumSpeed: Int = 120, hasAutomaticTransmission: Int = 0): Int {
    return 20000 - old * 2000 + (maximumSpeed - 120) * 100 -
            kilometers / 10000 * 200 + hasAutomaticTransmission * 1500
}