package `DAY 5`

fun main (){
    val age = 15

    if (age < 13){
        println("You are a child")
    }
    else if (age in 13..19){
        println("You are a teenager")
    }
    else if (age in 20..64){
        println("You are an adult")
    }
    else {
        println("YOu are a senior")
    }
}
