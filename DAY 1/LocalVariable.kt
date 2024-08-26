package `DAY 1`

fun exampleFunction() {
    val localVariable = "I'm a local variable"
    println(localVariable)  // Accessible here
}

fun  anotherFunction() {
    // println(localVariable) // Error: Cannot access 'localVariable' outside its scope
}

fun main() {
    exampleFunction()
    anotherFunction()
}