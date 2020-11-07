import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var aCount = 0
    var bCount = 0
    var cCount = 0
    var dCount = 0
    // put your code here
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            5 -> aCount++
            4 -> bCount++
            3 -> cCount++
            2 -> dCount++
        }
    }
    
    print("$dCount $cCount $bCount $aCount")
}