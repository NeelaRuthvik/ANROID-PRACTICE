package `DAY 8`

class Person(var name:String, var age:Int){

    constructor(x:String): this(){
        this.name = x
        this.age = 0
    }
    constructor( ):this("rahul",50)
    fun intro(){
        println("my name is $name and $age")
    }
}

fun main()
{
    var a = Person("Riya",22)
    a.intro()

    var b = Person()
    b.intro()

    var c = Person("Heena")
    c.intro()
}