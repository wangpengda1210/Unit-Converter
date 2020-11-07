package converter

import java.util.*

fun main() {
    
    var `in` = Scanner(System.`in`)
    
    print("Enter what you want to convert (or exit): ")
    var number = `in`.next()
    var originalMeasure: String
    var convertMeasure: String
    
    while (number != "exit") {
        
        var originalValue: Double = 0.0
        try {
            originalValue = number.toDouble()
        } catch (e: NumberFormatException) {
            `in` = Scanner(System.`in`)
            println("Parse error\n")
            print("Enter what you want to convert (or exit): ")
            number = `in`.next()
            continue
        }
        
        originalMeasure = `in`.next()
        if (originalMeasure.toLowerCase() in listOf("degree", "degrees")) originalMeasure +=
                " " + `in`.next()
        `in`.next()
        convertMeasure = `in`.next()
        if (convertMeasure.toLowerCase() in listOf("degree", "degrees")) convertMeasure +=
                " " + `in`.next()
        println(generateResult(originalValue, originalMeasure, convertMeasure))
        println()
    
        print("Enter what you want to convert (or exit): ")
        number = `in`.next()
        
    }
    
}

fun generateResult(originalValue: Double, originalMeasureInput: String, convertMeasureInput: String) : String {

    val originalMeasure = Measure.findMeasure(originalMeasureInput.toLowerCase())
    val convertMeasure = Measure.findMeasure(convertMeasureInput.toLowerCase())
    var convertMeasureName = convertMeasure?.standardNamePlural ?: "???"
    var originalMeasureName = originalMeasure?.standardNamePlural ?: "???"
    
    return when {
        
        convertMeasure == null || originalMeasure == null || convertMeasure.type != originalMeasure.type ->
            "Conversion from $originalMeasureName to $convertMeasureName is impossible"
        originalValue < 0 && originalMeasure.type == "distance" -> "Length shouldn't be negative"
        originalValue < 0 && originalMeasure.type == "weight" -> "Weight shouldn't be negative"
        else -> {
            val convertValue = if (originalMeasure.type == "temperature") {
                handleTemperature(originalMeasure, convertMeasure, originalValue)
            }
            else originalValue * originalMeasure.value / convertMeasure.value
            convertMeasureName = if (convertValue == 1.0) convertMeasure.standardName else convertMeasure.standardNamePlural
            originalMeasureName = if (originalValue == 1.0) originalMeasure.standardName else originalMeasure.standardNamePlural
            "$originalValue $originalMeasureName is $convertValue $convertMeasureName"
            
        }
    }

}

fun handleTemperature(originalMeasure: Measure, convertMeasure: Measure, originalValue: Double): Double {
    return when (originalMeasure) {
        Measure.CELSIUS -> {
            if (convertMeasure == Measure.FAHRENHEIT) originalValue * 9 / 5 + 32
            else if (convertMeasure == Measure.KELVINS) originalValue + 273.15
            else originalValue
        }
        Measure.FAHRENHEIT -> {
            if (convertMeasure == Measure.CELSIUS) (originalValue - 32) * 5 / 9
            else if (convertMeasure == Measure.KELVINS) (originalValue + 459.67) * 5 / 9
            else originalValue
        }
        else -> {
            if (convertMeasure == Measure.CELSIUS) originalValue - 273.15
            else if (convertMeasure == Measure.FAHRENHEIT) originalValue * 9 / 5 - 459.67
            else originalValue
        }
    }
}

enum class Measure(val standardName: String, val standardNamePlural: String,
                   val names: List<String>, val type: String, val value: Double = 0.0) {
    
    METER("meter", "meters",
            listOf("meter", "meters", "m"), "distance", 1.0),
    KILOMETER("kilometer", "kilometers",
            listOf("kilometer", "kilometers", "km"), "distance", 1000.0),
    CENTIMETER("centimeter", "centimeters",
            listOf("centimeter", "centimeters", "cm"), "distance", 0.01),
    MILLIMETER("millimeter", "millimeters",
            listOf("millimeter", "millimeters", "mm"), "distance", 0.001),
    MILE("mile", "miles",
            listOf("mile", "miles", "mi"), "distance", 1609.35),
    YARD("yard", "yards",
            listOf("yard", "yards", "yd"), "distance", 0.9144),
    FOOT("foot", "feet",
            listOf("foot", "feet", "ft"), "distance", 0.3048),
    INCH("inch", "inches",
            listOf("inch", "inches", "in"), "distance", 0.0254),
    GRAM("gram", "grams",
            listOf("gram", "grams", "g"), "weight", 1.0),
    KILOGRAM("kilogram", "kilograms",
            listOf("kilogram", "kilograms", "kg"), "weight", 1000.0),
    MILLIGRAM("milligram", "milligrams",
            listOf("milligram", "milligrams", "mg"), "weight", 0.001),
    POUND("pound", "pounds",
            listOf("pound", "pounds", "lb"), "weight", 453.592),
    OUNCE("ounce", "ounces",
            listOf("ounce", "ounces", "oz"), "weight", 28.3495),
    CELSIUS("degree Celsius", "degrees Celsius",
            listOf("degree celsius", "degrees celsius", "celsius", "dc", "c"),
            "temperature"),
    FAHRENHEIT("degree Fahrenheit", "degrees Fahrenheit",
            listOf("degree fahrenheit", "degrees fahrenheit", "fahrenheit", "df", "f"),
            "temperature"),
    KELVINS("kelvin", "kelvins",
            listOf("kelvin", "kelvins", "k"), "temperature");
    
    companion object {
        fun findMeasure(name: String): Measure? {
            for (measure in values()) {
                if (name in measure.names) return measure
            }
            return null
        }
    }
    
}
