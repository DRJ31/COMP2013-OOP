import java.util.*

fun main(args: Array<String>){
    val a: Int
    val b: Int
    val input = Scanner(System.`in`)
    print("Enter the first integer: ")
    a = input.nextInt()
    print("Enter the second integer: ")
    b = input.nextInt()
    if (a >= 0 && b >= 0)
        println("The integer $a and $b are both positive.")
    else
        println("The integer $a and $b are not both positive.")
}