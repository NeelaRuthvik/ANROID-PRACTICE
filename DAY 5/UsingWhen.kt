package `DAY 5`

fun main (){
    val dayOfweek = 3
    val dayName = when(dayOfweek)
    {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "wednsday"
        4 -> "thursday"
        5 -> "Friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "there are only seven days in a week "

    }
    println("Day ${dayOfweek} of week is ${dayName}")

}
