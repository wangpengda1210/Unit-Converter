import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    print(Country.findByName(input.next().toUpperCase()).currency == Country.findByName(input.next().toUpperCase()).currency)
}

enum class Country(val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar"),
    NULL("");
    
    companion object {
        fun findByName(name: String): Country {
            for (country in values()) {
                if (name == country.name) return country
            }
            return NULL
        }
    }
}