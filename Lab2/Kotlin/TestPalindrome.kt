import java.util.*

fun isPalindrome(str: String): Boolean{
    val length = str.length
    for (i in 1..length){
        if (str[i - 1] != str[length - i])
            return false
    }
    return true
}

fun main(args: Array<String>){
    var testChar: String = ""
    println("Enter a sentence: ")
    val input = Scanner(System.`in`)
    val str = input.nextLine()
    for (char in str.toLowerCase()){
        if (char in 'a'..'z'){
            testChar += char
        }
    }
    if (isPalindrome(testChar))
        println("\"$str\" is a palindrome sentence.")
    else
        println("\"$str\" is not a palindrome sentence.")
}