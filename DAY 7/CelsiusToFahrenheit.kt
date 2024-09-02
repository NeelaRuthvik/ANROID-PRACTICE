package `DAY 7`
fun CtoF(Celsius: Double): Double {
    return (9.0 / 5.0 * Celsius + 32)
}

fun FtoC(Fahrenheit: Double): Double {
    return (5.0 / 9.0 * (Fahrenheit - 32))
}

fun main() {
    // Read input for Celsius and Fahrenheit
    println("Enter temperature in Celsius:")
    val CelsiusInput = readLine()
    println("Enter temperature in Fahrenheit:")
    val FahrenheitInput = readLine()

    // Convert input strings to Double
    val Celsius = CelsiusInput?.toDoubleOrNull()
    val Fahrenheit = FahrenheitInput?.toDoubleOrNull()

    // Check if Celsius input is not null and convert it to Fahrenheit
    if (Celsius != null) {
        val fahrenheitResult = CtoF(Celsius)
        println("$Celsius°C is equivalent to $fahrenheitResult°F")
    } else {
        println("Invalid input for Celsius.")
    }

    // Check if Fahrenheit input is not null and convert it to Celsius
    if (Fahrenheit != null) {
        val celsiusResult = FtoC(Fahrenheit)
        println("$Fahrenheit°F is equivalent to $celsiusResult°C")
    } else {
        println("Invalid input for Fahrenheit.")
    }
}
