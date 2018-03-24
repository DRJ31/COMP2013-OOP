import java.util.*

fun main(args: Array<String>){
    val start: Int
    val end: Int
    val input = Scanner(System.`in`)
    print("Enter the start integer: ")
    start = input.nextInt()
    print("Enter the end integer: ")
    end = input.nextInt()
    for (i in start..end)
        print("$i ")
    println()
}