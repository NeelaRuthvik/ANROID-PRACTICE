package `DAY 7`

fun main() {
    // Define the number of terms to print in the Fibonacci series
    val numberOfTerms = 10

    // Print the Fibonacci series
    printFibonacciSeries(numberOfTerms)
}

fun printFibonacciSeries(n: Int) {
    var first = 0
    var second = 1

    // Print the first two terms of the Fibonacci series
    print("$first $second")

    // Loop through and print the rest of the Fibonacci series
    for (i in 3..n) {
        val next = first + second
        print(" $next")
        first = second
        second = next
    }
}
