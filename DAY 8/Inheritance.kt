package `DAY 8`

open class Recangle(val a: Double,val b:Double){
    fun area():Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimensions $a * $b is ${area()}")
    }
}

class Square(side: Double):Recangle(side,side){
    override fun display() {
        println("Area of square with side $a is ${area()}")
    }
}

fun main(){
    val myRecangle = Recangle(4.0,5.0)
    myRecangle.display()

    val mySquare = Square(3.0)
    mySquare.display()
}

