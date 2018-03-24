import java.util.*
import kotlin.math.abs

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    val arr = arrayOfNulls<Double>(5)
    for (i in arr.indices){
        print("Enter a floating point number: ")
        arr[i] = abs(input.nextDouble())
    }
    print("The result is: ")
    arr.forEach { print("$it ") }
    println()
}