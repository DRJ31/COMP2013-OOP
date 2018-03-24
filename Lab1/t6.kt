import java.util.*

fun main(args: Array<String>){
    val day_in_months = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val input = Scanner(System.`in`)
    var month: Int
    var day: Int
    var result = 0
    while (true){
        print("Enter the month: ")
        month = input.nextInt()
        if (month in 1..12)
            break
        println("Please input valid month!")
    }
    while (true){
        print("Enter the day: ")
        day = input.nextInt()
        if (day in 1..day_in_months[month - 1])
            break
        println("Please input valid date!")
    }
    for (i in 1 until (month - 1))
        result += day_in_months[i]
    result += day
    println("$day/$month is the day number $result in the year.")
}