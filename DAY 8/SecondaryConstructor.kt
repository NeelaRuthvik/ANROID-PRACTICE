package `DAY 8`

package `DAY 8`

// Primary Constructor is defined just after class name
// Secondary construtor is a adtional way to construct objects


// this key word is used to define the same class
class Person1{
    var name:String
    var age:Int

    constructor(x:String,y:Int){
        this.name = x
        this.age = y
    }
    constructor(x: String){
        this.name =x
        this.age = 0
    }
    constructor(){
        this.name = "Rahul"
        this.age = 32
    }

    fun intro()
    {
        println("my name is $name and age is $age")
    }


}
fun main()
{
    var a = Person1("Riya",22)
    a.intro()

    var b = Person1()
    b.intro()

    var c = Person1("Heena")
    c.intro()
}