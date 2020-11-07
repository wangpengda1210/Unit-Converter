import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val attribute = scanner.nextLine()
    val value = scanner.nextInt()
    
    print(when (attribute) {
        "amount" -> calculateDeposit(value)
        "percent" -> calculateDeposit(yearlyPercent = value)
        "years" -> calculateDeposit(years = value)
        else -> calculateDeposit()
    })
}

fun calculateDeposit(startingAmount: Int = 1_000,
                     yearlyPercent: Int = 5,
                     years: Int = 10): Int {
    return (startingAmount * Math.pow(1 + yearlyPercent / 100.0, years.toDouble())).toInt()
}