package `DAY 7`

fun factorial(n:Int): Int{
    return if (n <= 1) 1
    else n*factorial(n-1)
}

fun main()
{
    println("enter the number to find the Factorial")
    var y:Int = readln().toInt()
    var x = factorial(y)
    print(x)
}