package `DAY 2`

fun main(){
    //      Array of  Integers
    val numbers = arrayOf(1,2,3,4,5)
    //      Array of Strings
    val Words: Array<String> = arrayOf("Java","Python","Kotlin")
    //      Array of  squares using lambda function
    val squares = Array(5) {i -> i*i}
    println(squares.contentToString())
    println(Words.contentToString())
    println(numbers.contentToString())
}