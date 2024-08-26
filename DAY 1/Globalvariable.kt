package `DAY 1`

val globalVariable = "I'm a global variable"

fun exampleFunction1() {
    println(globalVariable)  // Accessible here
}

fun anotherFunction2() {
    println(globalVariable)  // Also accessible here
}

fun main (){
    exampleFunction1()
    anotherFunction2()
}