import java.util.*
import kotlin.math.abs

fun main(args: Array<String>){
    val num: Double
    val input = Scanner(System.`in`)
    print("Enter a floating-point number: ")
    num = input.nextDouble()
    println("The absolute value of $num is ${abs(num)}")
}