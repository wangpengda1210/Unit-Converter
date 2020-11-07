import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var largerPart = 0
    var smallerPart = 0
    var perfectPart = 0
    
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> largerPart++
            -1 -> smallerPart++
            0 -> perfectPart++
        }
    }
    
    print("$perfectPart $largerPart $smallerPart")
}