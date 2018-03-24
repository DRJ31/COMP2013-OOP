import java.util.*

fun main(args: Array<String>){
    val times: Int
    var result = 1.0
    val input = Scanner(System.`in`)
    print("How many floating point number do you want to multiply together: ")
    times = input.nextInt()
    for (i in 0 until times){
        print("Enter a floating point number: ")
        result *= input.nextDouble()
    }
    println("The product is $result")
}